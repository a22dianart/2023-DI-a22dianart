package org.example.exercicio2javafx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HBoxApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("HBox");

        Button button1 = new Button("1");
        Button button2 = new Button("2");

        HBox hbox = new HBox(button1, button2);

        hbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(hbox, 200, 100);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}