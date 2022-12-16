/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package br.edu.imc;

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
    private TextField txtIMC;
    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtClassifi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    Float peso, altura, imc;
    public void calcular(ActionEvent event ) {

        peso = Float.parseFloat(txtPeso.getText());
        altura = Float.parseFloat(txtAltura.getText());
        imc = peso / (altura*altura);
        txtIMC.setText (String.valueOf(imc));
    }
    public void clasificacao(ActionEvent event){
        String classfic;
        if(imc < 18.5){
            classfic = "Abaixo do peso normal";
            txtClassifi.setText(String.valueOf(classfic));
        }
        else if(imc > 18.5 && imc < 24.9){
            classfic = "Peso Normal";
            txtClassifi.setText(String.valueOf(classfic));
        }
        else if(imc > 25 && imc < 29.9){
            classfic = "Excesso de peso";
            txtClassifi.setText(String.valueOf(classfic));
        }
        else if(imc > 30 && imc < 34.9){
            classfic = "Obesidade Classe I";
            txtClassifi.setText(String.valueOf(classfic));
        }
        else if(imc > 35 && imc < 39.9){
            classfic = "Obesidade Classe II";
            txtClassifi.setText(String.valueOf(classfic));
        }
        else if(imc > 40){
            classfic = "Obesidade Classe III";
            txtClassifi.setText(String.valueOf(classfic));
        }

    }
    
}
