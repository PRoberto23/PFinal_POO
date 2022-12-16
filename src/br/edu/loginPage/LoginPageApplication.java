
package br.edu.loginPage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginPageApplication extends Application {
    private static Stage stage;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/br/edu/loginPage/view/LoginPage.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("/br/edu/loginPage/view/application.css").toExternalForm());
        
        stage.initStyle(StageStyle.UNDECORATED);
        
        stage.setTitle("Login");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();

    }
    public void fechaAba(){

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
