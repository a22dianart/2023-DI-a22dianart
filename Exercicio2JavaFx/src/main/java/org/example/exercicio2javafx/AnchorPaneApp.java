package org.example.exercicio2javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AnchorPaneApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("AnchorPane");
        AnchorPane anchorPane = new AnchorPane();
        Button b1 = new Button(String.valueOf("BOTON"));
        AnchorPane.setBottomAnchor(b1, 10d);
        AnchorPane.setRightAnchor(b1,10d);
        anchorPane.getChildren().add(b1);


        Scene scene = new Scene(anchorPane, 200, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}