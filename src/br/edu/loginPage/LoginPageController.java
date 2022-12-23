package br.edu.loginPage;

import java.io.IOException;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoginPageController implements Initializable {

    @FXML
    private AnchorPane anPane;
    @FXML
    private Pane pnPane;
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField psdSenha;
    @FXML
    private Hyperlink hlinkAjuda;
    @FXML
    private Label lblMEPD;
    @FXML
    private Button btnSingIn;
    @FXML
    private Hyperlink hlinkSingUp;
    @FXML
    private ImageView imgJavaIcon;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblPassword;
     @FXML
    public Button btnClose;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /*
    Metodo que usa "ActionEvent" para criar uma cena que usa o arquivo FXML "chossePage", a ação só é executada quando
    o botão (id: btnSingIn) é clicado. O único usuário adicionado é o 'admin' que foi adicionado manualmente no método
    */
    
    /*
    Precisa adicionar ação do teclado para executar o método quando o enter for clicado e não somente quando o botão é clicado
    */
    @FXML
    private void loginButton(ActionEvent event) throws IOException {
         if(event.getSource() == btnSingIn ){
           String userName = txtEmail.getText();
           String password = psdSenha.getText();
           
           if(userName.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
               Stage escpage = new Stage();
               Parent root = FXMLLoader.load(getClass().getResource("/br/edu/chossePage/chossePage.fxml"));
        
                Scene scene = new Scene(root);
        
                escpage.setTitle("Escolha");
                escpage.setScene(scene);
                escpage.show();
           }
        }
    }
    
    /*
    Método que habilita o botão que fecha a página de login
    */
    @FXML
    private  void closeBtn (ActionEvent evt){
        System.exit(0);
        
    }
}


