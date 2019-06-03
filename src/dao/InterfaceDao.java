/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;


/**
 *
 * @author Usuario
 */
public interface InterfaceDao {
    
    public boolean inserirObjeto(Object modelo);
    void atualizarObjeto(Object modelo);
    void deletarObjeto(int codigo);

    List<Object> buscarTodos();
    Object buscarPorCodigo(int codigoProduto);
    Object buscaPorNome(String nomeProduto);
}
