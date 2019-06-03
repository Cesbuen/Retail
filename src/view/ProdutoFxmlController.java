/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ProdutoController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ProdutoFxmlController implements Initializable {

    @FXML
    private Button btn_salvarProduto;

    @FXML
    private Button btn_cancelarProduto;
    
    @FXML
    private TextField tf_codigoProduto;
    
    @FXML
    private TextField tf_nomeProduto;

    @FXML
    private ComboBox<String> cb_categoriaProduto;

    @FXML
    private TextField tf_quantidadeProduto;

  
    @FXML
    void salvarProduto(ActionEvent event) {
        String nomeProduto = tf_nomeProduto.getText();
        String categoriaProduto = cb_categoriaProduto.getSelectionModel().getSelectedItem();
        Integer quantidadeProduto = Integer.parseInt(tf_quantidadeProduto.getText());

        ProdutoController.salvarProduto(null,
                nomeProduto,
                categoriaProduto,
                quantidadeProduto);

        limparCampos();
    }
    
    @FXML
    void cancelarProduto(ActionEvent event) {
        limparCampos();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cb_categoriaProduto.getItems().removeAll(cb_categoriaProduto.getItems());
        cb_categoriaProduto.getItems().setAll("Cozinha", "Limpeza", "Higiêne", "Eletrônico");
        cb_categoriaProduto.getSelectionModel().select("Cozinha");
    }

    
    private void limparCampos() {
        tf_nomeProduto.clear();
        cb_categoriaProduto.getSelectionModel().select("Cozinha");
        tf_quantidadeProduto.clear();
    }
}
