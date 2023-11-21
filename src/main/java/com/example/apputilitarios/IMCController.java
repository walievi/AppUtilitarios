package com.example.apputilitarios;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class IMCController {

    @FXML
    private TextField pesoText;

    @FXML
    private TextField alturaText;

    @FXML
    private Label resultadoLabel;

    @FXML
    protected void onCalcularButtonClick(){
        try {
            double peso = Double.parseDouble(pesoText.getText());
            double altura = Double.parseDouble(alturaText.getText());
            double imc = peso / (altura * altura);

            resultadoLabel.setText("Seu IMC é: " + String.format("%.2f", imc));
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Por favor, insira números válidos.");
        }
    }
}
