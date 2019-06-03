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
import model.Produto;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class ProdutoFxmlController implements Initializable {

    @FXML
    private Button btn_salvarProduto;

    @FXML
    private TextField tf_nomeProduto;
    
    @FXML
    private ComboBox<?> cb_categoriaProduto;

    @FXML
    private TextField tf_quantidadeProduto;
    
    @FXML
    void salvarProduto(ActionEvent event) {
        ProdutoController.salvarProduto(null, tf_nomeProduto.getText(), "teste", Integer.parseInt(tf_quantidadeProduto.getText()));
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
