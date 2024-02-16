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
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DatePickerApp extends Application {
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

        DatePicker data = new DatePicker();
        gridPane.add(data,0,0);
        Label dataSelect = new Label();
        gridPane.add(dataSelect,0,1);

        data.setOnAction(event -> {
            LocalDate selectedDate = data.getValue();
            if (selectedDate != null) {
                String formattedDate = formatarFechaConMesEnLetras(selectedDate);
                dataSelect.setText(formattedDate);
            } else {
            }


        });








        Scene scene = new Scene(gridPane, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    private String formatarFechaConMesEnLetras(LocalDate fecha) {

        String nombreMes = fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());

        return fecha.getDayOfMonth()+" " + nombreMes + " "+ fecha.getYear();
    }
}