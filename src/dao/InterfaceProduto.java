/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Produto;

/**
 *
 * @author Usuario
 */
public interface InterfaceProduto {
    
    void inserir(Produto modelo);
    void atualizar(Produto modelo);
    void deletar(int codigoProduto);

    List<Produto> buscarTodos();
    Produto buscarPorCodigo(int codigoProduto);
    Produto buscaPorNome(String nomeProduto);

}
