/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Produto;

/*
 *
 * @author Usuario
 */
public class ProdutoDao implements InterfaceProduto {

    private EntityManager em;

    public ProdutoDao(EntityManager em) {
        this.em = em;
    }

    @Override
    public void inserir(Produto modelo) {
        em.persist(modelo);
    }

    @Override
    public void atualizar(Produto modelo) {
        em.merge(modelo);
    }

    @Override
    public void deletar(int codigoProduto) {
        em.remove(buscarPorCodigo(codigoProduto));
    }

    @Override
    public List<Produto> buscarTodos() {
        return em.createQuery("SELECT produto FROM Produto produto", Produto.class).getResultList();
    }

    @Override
    public Produto buscarPorCodigo(int codigoProduto) {
        return em.createQuery("SELECT produto from Produto produto WHERE produto.prod_codigo = "+codigoProduto, Produto.class).getSingleResult();
    }

    @Override
    public Produto buscaPorNome(String nomeProduto) {
        return em.createQuery("SELECT produto from Produto produto WHERE produto.prod_nome = "+nomeProduto, Produto.class).getSingleResult();
    }

}
