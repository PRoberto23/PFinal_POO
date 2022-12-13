/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package loginpage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Paulo Roberto
 */
public class ImcPageController implements Initializable {

    @FXML
    private Pane pnPane;
    @FXML
    private Button btnCalcIMC;
    @FXML
    private TextField txtPeso;
    @FXML
    private TextField txtAltura;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void calcular(ActionEvent event ) {
      Float peso, altura, imc;
        peso = Float.parseFloat(txtPeso.getText());
        altura = Float.parseFloat(txtAltura.getText());
        imc = peso / (altura*altura); 
        System.out.println(imc);
        //txtIMC.setText (String.valueOf(IMC));
    }
    
}
