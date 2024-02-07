package org.example.exercicio2javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FlowPaneApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("FlowPane");
        FlowPane flowPane = new FlowPane();
        for (int i = 0; i < 21; i++) {
            Button b1 = new Button(String.valueOf(i));
            flowPane.getChildren().add(b1);
        }

        Scene scene = new Scene(flowPane, 200, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}