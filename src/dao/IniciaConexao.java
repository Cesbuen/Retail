package dao;

import model.InfoConection;

public class IniciaConexao {
	
	private static final String driver = "org.postgresql.Driver";
	private static final String server = "localhost";
	private static final String user = "postgres";
	private static final String pass = "root";
	private static final String database = "Retail";
	
	public Object iniciar(){
	InfoConection c = new InfoConection(driver, server, user, pass, database);
	return c;
	}
	
	public Object iniciar(InfoConection infoconection){
	InfoConection c = new InfoConection(infoconection.getDriver(), infoconection.getHost(), infoconection.getUser(), infoconection.getPass(), infoconection.getDatabase());
	return c;
	}
}
