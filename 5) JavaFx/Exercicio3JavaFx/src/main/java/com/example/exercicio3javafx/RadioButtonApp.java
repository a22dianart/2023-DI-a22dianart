package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class RadioButtonApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("");

        RadioButton radioButton1 = new RadioButton("Opción 1");
        RadioButton radioButton2 = new RadioButton("Opción 2");
        RadioButton radioButton3 = new RadioButton("Opción 3");

        ToggleGroup toggleGroup = new ToggleGroup();
        radioButton1.setToggleGroup(toggleGroup);
        radioButton2.setToggleGroup(toggleGroup);
        radioButton3.setToggleGroup(toggleGroup);


        Label label = new Label("Ningún botón seleccionado");

        // Asignar un evento al cambiar la selección del botón de radio
        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                label.setText("Seleccionado: " + selectedRadioButton.getText());
            }
        });



        VBox root = new VBox();
        root.getChildren().add(radioButton1);
        root.getChildren().add(radioButton2);
        root.getChildren().add(radioButton3);
        root.getChildren().add(label);






        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}