package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TextFieldApp extends Application {
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

        Label nomeLbl = new Label("Nome");
        nomeLbl.setMnemonicParsing(true);
        nomeLbl.setText("_Nome");
        gridPane.add(nomeLbl,0,0);

        TextField nomeTxt = new TextField();
        gridPane.add(nomeTxt,1,0);
        nomeLbl.setLabelFor(nomeTxt);

        Label enderezoLbl = new Label("Enderezo");
        enderezoLbl.setMnemonicParsing(true);
        enderezoLbl.setText("_Enderezo");
        gridPane.add(enderezoLbl,0,1);

        TextField enderezoTxt = new TextField("");
        gridPane.add(enderezoTxt,1,1);
        enderezoLbl.setLabelFor(enderezoTxt);

        Label ocupacionLbl = new Label("Ocupacion");
        ocupacionLbl.setMnemonicParsing(true);
        ocupacionLbl.setText("_Ocupacion");
        gridPane.add(ocupacionLbl,0,2);

        TextField ocupacionTxt = new TextField("");
        gridPane.add(ocupacionTxt,1,2);
        ocupacionLbl.setLabelFor(ocupacionTxt);
        ocupacionLbl.setLabelFor(ocupacionTxt);








        Scene scene = new Scene(gridPane, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}