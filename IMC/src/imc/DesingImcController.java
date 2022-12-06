/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package imc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class DesingImcController implements Initializable {

    @FXML
    private Button calcularbutton;
    @FXML
    private TextField txtpeso;
    @FXML
    private TextField txtaltura;
    @FXML
    private TextField txtIMC;
    @FXML
    private TextField txtclassificaçao;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void calcular(ActionEvent event) {
      Float peso, altura, IMC;
        peso = Float.parseFloat(txtpeso.getText());
        altura = Float.parseFloat(txtaltura.getText());
        IMC = peso / (altura*altura); 
        txtIMC.setText (String.valueOf(IMC));
    }
    }

    

