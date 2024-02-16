package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ChoiceBoxApp extends Application {
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

        Label etiqueta = new Label("Choice 1");
        gridPane.add(etiqueta, 0, 0);
        ChoiceBox elixir = new ChoiceBox();
        elixir.getItems().add("Choice 1");
        elixir.getItems().add("Choice 2");
        elixir.getItems().add("Choice 3");
        elixir.getSelectionModel().select(0);
        gridPane.add(elixir, 1,0);

        elixir.setOnAction((event) -> {
            Object selectedItem = elixir.getSelectionModel().getSelectedItem();

            etiqueta.setText(selectedItem.toString());
        });







        Scene scene = new Scene(gridPane, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}