/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import model.Produto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

/*
 *
 * @author Usuario
 */
public class ProdutoDao implements InterfaceDao {

    public static ProdutoDao produtoDao = null;

    private SessionFactory factory;
    private Transaction transaction;

    public ProdutoDao() {
        factory = HibernateUtil.getSessionFactory();
    }

    public static ProdutoDao getInstance() {
        if (produtoDao == null) {
            produtoDao = new ProdutoDao();
        }
        return produtoDao;
    }
    
    @Override
    public boolean inserirObjeto(Object produto) {
        boolean retorno = false;
        Session sessao = factory.openSession();

        try {
            transaction = sessao.beginTransaction();
            sessao.save(produto);
            transaction.commit();
            retorno = true;
        } catch (Exception ex) {
            transaction.rollback();
            retorno = false;
            ex.printStackTrace();
        } finally {
            sessao.close();
        }

        return retorno;
    }

    @Override
    public void atualizarObjeto(Object modelo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletarObjeto(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscarPorCodigo(int codigoProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object buscaPorNome(String nomeProduto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
