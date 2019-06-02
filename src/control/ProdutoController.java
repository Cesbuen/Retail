/*
 * CLASSE CONTROLADORA DAS FUNÇÕES PRIMORDIAIS DA APLICAÇÃO, AQUI SERÁ FEITA TODAS AS MODIFICAÇÕES
 * E ADIÇÕES AO QUE SE REFERE REGRAS DE NEGÓCIO EM RELAÇÃO AO CADASTRO DE PRODUTOS.
 */
package control;

import dao.Conexao;
import dao.ProdutoDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Produto;
import view.ProdutoView_Old;

/**
 *
 * @author Cesar Bueno
 */
public class ProdutoController {

    private final ProdutoView_Old produtoView;

    public ProdutoController(ProdutoView_Old produtoView) {
        this.produtoView = produtoView;
    }

    public static boolean salvarProduto(String nomeProduto, String categoriaProduto, Integer quantidadeProduto) {
        if(nomeProduto.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nome do produto não foi informado");
            return false;
        }
        Produto produto = new Produto(nomeProduto, categoriaProduto, quantidadeProduto);

        Conexao conexao = new Conexao();
        ProdutoDao produtoDao = new ProdutoDao(conexao);
        produtoDao.salvarProduto(produto);

        return produto.persistir();
    }

    public static String buscarCodigoProduto() {
        Conexao conexao = new Conexao();
        ProdutoDao produtoDao = new ProdutoDao(conexao);
        return String.valueOf(Integer.parseInt(produtoDao.buscarCodigoProduto()) + 1);
    }

    public static ArrayList<Produto> pegarProdutos() {
        Conexao conexao = new Conexao();
        ProdutoDao pd = new ProdutoDao(conexao);
        ArrayList<Produto> produtos = pd.buscarTodosProdutos();
        conexao.fechar();

        return produtos;
    }
}
