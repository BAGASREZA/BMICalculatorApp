/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author user
 */
public class FXMLController implements Initializable {

    @FXML
    private TextField tinggiBadanTextField;
    @FXML
    private TextField beratBadanTextField;
    @FXML
    private TextField nilaiBodyMassIndexTextField;
    @FXML
    private TextField kondisiTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hitungButtonPressed(ActionEvent event) {
        double tinggiBadan = Double.parseDouble(tinggiBadanTextField.getText());
        double beratBadan = Double.parseDouble(beratBadanTextField.getText());
        
        double meter = tinggiBadan / 100;
        double nilaiBodyMassIndex = beratBadan / (meter * meter);
        String kondisi = null;
        if (nilaiBodyMassIndex < 18.5){
            kondisi = "Underweight";
        } else if (18.5 <= nilaiBodyMassIndex && nilaiBodyMassIndex <= 24.9){
            kondisi = "Normal";
        } else if (25 <= nilaiBodyMassIndex && nilaiBodyMassIndex <= 29.9){
            kondisi = "Overweight";
        }else if (nilaiBodyMassIndex > 30)
            kondisi = "Obese";
        
        
        nilaiBodyMassIndexTextField.setText(Double.toString(nilaiBodyMassIndex));
        kondisiTextField.setText(kondisi);
        
    }
    
}
