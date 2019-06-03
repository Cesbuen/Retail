/*
 * CLASSE CONTROLADORA DAS FUNÇÕES PRIMORDIAIS DA APLICAÇÃO, AQUI SERÁ FEITA TODAS AS MODIFICAÇÕES
 * E ADIÇÕES AO QUE SE REFERE REGRAS DE NEGÓCIO EM RELAÇÃO AO CADASTRO DE PRODUTOS.
 */
package control;

import dao.Conexao;
import dao.ProdutoDao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.enterprise.context.ApplicationScoped;
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

    private final ProdutoView produtoView;

    public ProdutoController(ProdutoView produtoView) {
        this.produtoView = produtoView;
    }

    public static boolean salvarProduto(String nomeProduto, String categoriaProduto, Integer quantidadeProduto) {
        if (nomeProduto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome do produto não foi informado");
            return false;
        }
        Produto produto = new Produto(nomeProduto, categoriaProduto, quantidadeProduto);

        //Conexao conexao = new Conexao();
        ProdutoDao produtoDao = new ProdutoDao(em);
        produtoDao.inserir(produto);

        return true;
    }


    public static List<Produto> buscarProdutos() {
        //Conexao conexao = new Conexao();
        ProdutoDao pd = new ProdutoDao(em);
        List<Produto> produtos = pd.buscarTodos();
        //conexao.fechar();

        return produtos;
    }
}
