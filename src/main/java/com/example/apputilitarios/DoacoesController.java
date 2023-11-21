package com.example.apputilitarios;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class DoacoesController {

    @FXML
    private TextField valorDoacaoTextField;

    @FXML
    private ListView<Double> doacoesListView;

    @FXML
    private Label valorTotalLabel;

    private List<Double> doacoes;
    private double totalDoacoes;

    public DoacoesController() {
        doacoes = new ArrayList<>();
        totalDoacoes = 0.0;
    }

    @FXML
    private void onAdicionarButtonClick() {
        try {
            double valorDoacao = Double.parseDouble(valorDoacaoTextField.getText());
            doacoes.add(valorDoacao);
            totalDoacoes += valorDoacao;

            atualizarListView();
            atualizarValorTotal();
        } catch (NumberFormatException e) {
            // Tratar erro de formatação do número
            valorDoacaoTextField.setText("Entrada inválida!");
        }
    }

    private void atualizarListView() {
        doacoesListView.getItems().setAll(doacoes);
    }

    private void atualizarValorTotal() {
        valorTotalLabel.setText(String.format("R$ %.2f", totalDoacoes));
    }
}
