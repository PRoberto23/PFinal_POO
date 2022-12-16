/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.singUp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Paulo Roberto
 */
public class SingUpPageController implements Initializable {

    @FXML
    private Pane pnPane;
    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtEmailadd;
    @FXML
    private TextField txtEmailconfir;
    @FXML
    private PasswordField psdCreate;
    @FXML
    private PasswordField psdConfirmpass;
    @FXML
    private Button btnCreate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
