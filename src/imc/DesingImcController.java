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
        System.out.println(peso);
        altura = Float.parseFloat(txtaltura.getText());
        System.out.println(altura);
        IMC = (altura*altura); 
        txtIMC.setText (String.valueOf(IMC));
       
        String classfic;
        if(IMC < 18.5){
            classfic = "Abaixo do peso normal";
            txtclassificaçao.setText(String.valueOf(classfic));
        }
        else if(IMC > 18.5 && IMC < 24.9){
            classfic = "Peso Normal";
            txtclassificaçao.setText(String.valueOf(classfic));
        }
        else if(IMC > 25 && IMC < 29.9){
            classfic = "Excesso de peso";
            txtclassificaçao.setText(String.valueOf(classfic));
        }
        else if(IMC > 30 && IMC < 34.9){
            classfic = "Obesidade Classe I";
            txtclassificaçao.setText(String.valueOf(classfic));
        }
        else if(IMC > 35 && IMC < 39.9){
            classfic = "Obesidade Classe II";
            txtclassificaçao.setText(String.valueOf(classfic));
        }
        else if(IMC > 40){
            classfic = "Obesidade Classe III";
            txtclassificaçao.setText(String.valueOf(classfic));
        }
    }
    
     public void clasificacao(ActionEvent event){
        

    }
    }
