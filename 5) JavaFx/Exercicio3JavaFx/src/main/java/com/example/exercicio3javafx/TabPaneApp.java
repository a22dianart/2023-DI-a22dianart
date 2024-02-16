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

public class TabPaneApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("");
        TabPane tabPane = new TabPane();

        // Crear la primera pestaña con controles
        Tab tab1 = new Tab("Pestaña 1");
        VBox tab1Content = new VBox(10);
        tab1Content.getChildren().addAll(
                new Label("Etiqueta en la pestaña 1")
        );
        tab1.setContent(tab1Content);

        Tab tab2 = new Tab("Pestaña 2");
        VBox tab2Content = new VBox(10);
        tab2Content.getChildren().addAll(
                new Label("Etiqueta en la pestaña 2")
        );
        tab2.setContent(tab2Content);

        tabPane.getTabs().addAll(tab1, tab2);
        VBox root = new VBox();
        root.getChildren().add(tabPane);





        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}