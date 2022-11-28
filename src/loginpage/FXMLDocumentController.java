/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package loginpage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Paulo Roberto
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField psdSenha;
    @FXML
    private Hyperlink hlinkAjuda;
    @FXML
    private Button btnSingIn;
    @FXML
    private Hyperlink hlinkSingUp;
    @FXML
    private Label lblMEPD;
    
   public void loginButton(ActionEvent event) throws IOException{
       if(event.getSource() == btnSingIn){
           String userName = txtEmail.getText();
           String password = psdSenha.getText();
           if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
               Stage escpage = new Stage();
               Parent root = FXMLLoader.load(getClass().getResource("Escolhapage.fxml"));
        
                Scene scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        
                escpage.setTitle("Escolha");
                escpage.setScene(scene);
                escpage.show();
           }
       }
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
