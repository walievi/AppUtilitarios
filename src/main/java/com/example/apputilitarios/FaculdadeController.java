package com.example.apputilitarios;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FaculdadeController {

    @FXML
    private TextField creditosTextField;

    @FXML
    private ComboBox<String> cursoComboBox;

    @FXML
    private Label valorTotalLabel;

    @FXML
    private Label valorParcelaLabel;

    @FXML
    private void onCalcularButtonClick() {
        try {
            int creditos = Integer.parseInt(creditosTextField.getText());
            String curso = cursoComboBox.getValue();

            double valorTotal = calcularValorTotal(creditos, curso);
            double valorParcela = valorTotal / 6;

            valorTotalLabel.setText(String.format("R$ %.2f", valorTotal));
            valorParcelaLabel.setText(String.format("R$ %.2f por parcela", valorParcela));
        } catch (NumberFormatException e) {
            valorTotalLabel.setText("Erro na entrada de créditos.");
            valorParcelaLabel.setText("");
        }
    }

    private double calcularValorTotal(int creditos, String curso) {
        double valorPorCredito = 635.0;
        return creditos * valorPorCredito;
    }


    public void initialize() {
        cursoComboBox.getItems().addAll("Redes", "ADS", "ADM");
    }
}
