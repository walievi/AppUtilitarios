package com.example.apputilitarios;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class InicialController {

    @FXML
    protected void onSairButtonClick(){
        System.exit(0);
    }

    @FXML
    protected void onIMCButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(InicialController.class.getResource("imc-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Cálculo de IMC");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onMediaButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(InicialController.class.getResource("media-notas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Média de Notas");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onMoedasButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(InicialController.class.getResource("conversor-moedas-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Conversor de Moedas");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void onFaculdadeButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(InicialController.class.getResource("simula-faculdade-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Simula Parcelamento Faculdade");
        stage.setScene(scene);
        stage.show();
    }


    public void onDoacoesButtonClick() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(InicialController.class.getResource("controla-doacoes-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        stage.setTitle("Controle de Doações");
        stage.setScene(scene);
        stage.show();
    }
}
