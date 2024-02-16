package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckBoxApp extends Application {
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

        Label etiqueta = new Label("Sen seleccionar");
        gridPane.add(etiqueta, 0, 0);
        CheckBox check = new CheckBox();
        gridPane.add(check, 1,0);

        check.setOnAction(event -> {
            if (check.isSelected()) {
                etiqueta.setText("Está seleccionado");
            } else {
                etiqueta.setText("Sen seleccionar");
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