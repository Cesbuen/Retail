package control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import dao.IniciaConexao;
import model.InfoConection;

public class Conectar {

	public static String status1 = "Falha ao se conectar.";
	public static String status2 = "Falha ao se conectar.";

	public static java.sql.Connection getConectar() {
		IniciaConexao ic = new IniciaConexao();
		ic.iniciar();

		Connection con = null;


		try {
			Class.forName(((InfoConection) ic.iniciar()).getDriver());
			String host = ((InfoConection) ic.iniciar()).getHost();
			String database = ((InfoConection) ic.iniciar()).getDatabase();

			String url = "jdbc:postgresql://" + host + "/" + database;
			String user = ((InfoConection) ic.iniciar()).getUser();

			String password = ((InfoConection) ic.iniciar()).getPass();

			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				status1 = ("Conectado com sucesso!");
			} else {
				status1 = ("Não foi possivel realizar conexão!");
			}
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}
	
	public static java.sql.Connection getConectar(InfoConection infoconection) {
		IniciaConexao ic = new IniciaConexao();
		ic.iniciar(infoconection);

		Connection con = null;


		try {
			Class.forName(((InfoConection) ic.iniciar()).getDriver());
			String host = ((InfoConection) ic.iniciar()).getHost();
			String database = ((InfoConection) ic.iniciar()).getDatabase();

			String url = "jdbc:postgresql://" + host + "/" + database;
			String user = ((InfoConection) ic.iniciar()).getUser();

			String password = ((InfoConection) ic.iniciar()).getPass();

			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				status2 = ("Conectado com sucesso!");
			} else {
				status2 = ("Não foi possivel realizar conexão!");
			}
			return con;
		} catch (ClassNotFoundException e) {
			System.out.println("O driver expecificado nao foi encontrado.");
			return null;
		} catch (SQLException e) {
			System.out.println("Nao foi possivel conectar ao Banco de Dados.");
			return null;
		}
	}

	public static String statusConectionPadrao() {
		return status1;
	}
	
	public static String statusConectionGerado() {
		return status2;
	}

	public static boolean FecharConexao() {
		try {
			Conectar.getConectar().close();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	public static java.sql.Connection ReiniciarConexao() {
		FecharConexao();
		return Conectar.getConectar();
	}

}