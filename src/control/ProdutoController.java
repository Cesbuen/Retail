/*
 * CLASSE CONTROLADORA DAS FUNÇÕES PRIMORDIAIS DA APLICAÇÃO, AQUI SERÁ FEITA TODAS AS MODIFICAÇÕES
 * E ADIÇÕES AO QUE SE REFERE REGRAS DE NEGÓCIO EM RELAÇÃO AO CADASTRO DE PRODUTOS.
 */
package control;

import dao.ProdutoDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.PersistenceContext;
import javax.swing.JOptionPane;
import model.Produto;
import view.ProdutoView;

/**
 *
 * @author Cesar Bueno
 */
@ApplicationScoped
public class ProdutoController {

    @PersistenceContext(unitName = "Produto")
    private static EntityManager em;

    @Produces
    public static boolean salvarProduto(Long codigoProduto, String nomeProduto, String categoriaProduto, Integer quantidadeProduto) {
        if (nomeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do produto não foi informado");
            return false;
        }
        Produto produto = new Produto(codigoProduto, nomeProduto, categoriaProduto, quantidadeProduto);
        ProdutoDao.getInstance().inserirObjeto(produto);
        return true;
    }
}
