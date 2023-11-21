package com.example.apputilitarios;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ConversorMoedasController {

    @FXML
    private TextField valorReaisText;

    @FXML
    private ComboBox<String> moedaComboBox;

    @FXML
    private Label resultadoLabel;

    @FXML
    protected void onCalcularButtonClick(){
        try {
            double valorEmReais = Double.parseDouble(valorReaisText.getText());
            String moedaSelecionada = moedaComboBox.getValue();

            double valorConvertido = converterMoeda(valorEmReais, moedaSelecionada);
            resultadoLabel.setText(String.format("Valor em %s: %.2f", moedaSelecionada, valorConvertido));
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Erro: Por favor, insira um valor numérico válido.");
        } catch (NullPointerException e) {
            resultadoLabel.setText("Erro: Por favor, selecione uma moeda.");
        }
    }

    private double converterMoeda(double valorEmReais, String moeda) {
        switch (moeda) {
            case "Dólar Americano":
                return valorEmReais * 0.20;
            case "Euro":
                return valorEmReais * 0.18;
            case "Libra Esterlina":
                return valorEmReais * 0.15;
            default:
                return 0;
        }
    }
}
