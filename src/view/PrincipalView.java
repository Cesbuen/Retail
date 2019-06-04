/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class PrincipalView extends Application {

    @Override
    public void start(Stage principalTela) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("PrincipalFxml.fxml"));

        Scene cena = new Scene(root);
        principalTela.setScene(cena);
        principalTela.setTitle("Retail Software");
        principalTela.show();
     
    }

    public static void main(String[] args) {
        launch(args);
    }
}
