package com.example.apputilitarios;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MediaNotasController {

    @FXML
    private TextField nota1Text;
    @FXML
    private TextField nota2Text;
    @FXML
    private TextField nota3Text;
    @FXML
    private Label resultadoLabel;

    @FXML
    protected void onCalcularButtonClick(){
        double n1 = Double.parseDouble(nota1Text.getText());
        double n2 = Double.parseDouble(nota2Text.getText());
        double n3 = Double.parseDouble(nota3Text.getText());
        double media = (n1 + n2 + n3) / 3;
        String mensagem = "Sua média é " + media;
        resultadoLabel.setText(mensagem);
    }

}
