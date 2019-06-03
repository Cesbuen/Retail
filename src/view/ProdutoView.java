/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.ProdutoController;
import dao.ProdutoDao;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Produto;

/**
 *
 * @author Cesar Bueno
 */
public class ProdutoView extends Application {

    @Override
    public void start(Stage palcoPrimario) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ProdutoFxml.fxml"));
        
        Scene cena = new Scene(root);
        palcoPrimario.setScene(cena);
        palcoPrimario.show();
       
    }
    
    public static void main(String[] args) {
        launch(args);
    }

}
