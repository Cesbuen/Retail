/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class PrincipalFxmlController implements Initializable {

    @FXML
    private MenuItem mi_adicionarProduto;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mi_adicionarProduto.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                ProdutoView pv = new ProdutoView();
                try {
                    pv.start(new Stage());
                } catch (Exception ex) {
                    Logger.getLogger(PrincipalFxmlController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
