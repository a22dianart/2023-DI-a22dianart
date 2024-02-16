package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ProgressBarApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));
        gridPane.setPrefWidth(400);
        gridPane.setPrefHeight(275);
        gridPane.setAlignment(Pos.CENTER);

        ProgressBar progreso = new ProgressBar(0);
        gridPane.add(progreso, 0,0);

        Button aumentar = new Button("Aumentar");
        gridPane.add(aumentar, 0, 1);

        Button diminuir = new Button("Diminuir");
        gridPane.add(diminuir,1,1);

        ProgressIndicator indicador = new ProgressIndicator(0);
        gridPane.add(indicador,0,2);

        aumentar.setOnAction(event -> {
            double newValue = progreso.getProgress() + 0.1; // Incremento de 0.1
            if (newValue <= 1.0) { // Asegurarse de que no exceda el máximo
                progreso.setProgress(newValue);
                indicador.setProgress(newValue);

            }
        });
        diminuir.setOnAction(event -> {
            double newValue = progreso.getProgress() - 0.1;
            if (newValue > 0.0) {
                progreso.setProgress(newValue);
                indicador.setProgress(newValue);
            }
        });








        Scene scene = new Scene(gridPane, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}