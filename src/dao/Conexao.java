/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import control.Conectar;
import model.InfoConection;

/**
 *
 * @author Usuario
 */
public class Conexao {

    	Conectar con = new Conectar();
	
	public void iniciar(){
		con.getConectar();
	}
	
	public void iniciar(InfoConection conex){
		con.getConectar(conex);
	}
	
	public void fechar(){
		con.FecharConexao();
	}
	
	public Object statusPadrao(){
		return con.statusConectionPadrao();
	}
	
	public Object statusGerado(){
		return con.statusConectionGerado();
	}
	
	public void reiniciar(){
		con.ReiniciarConexao();
	}
    
}
