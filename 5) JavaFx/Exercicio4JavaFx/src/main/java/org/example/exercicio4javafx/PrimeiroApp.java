package org.example.exercicio4javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class PrimeiroApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Primeiro");
        AnchorPane anchorPane = new AnchorPane();
        Rectangle rect = new Rectangle(100, 50); // Ancho y alto del rectángulo
        rect.setFill(Color.WHITE); // Color de relleno del rectángulo
        rect.setStroke(Color.BLACK); // Color del borde del rectángulo
        AnchorPane.setBottomAnchor(rect, 20d);
        AnchorPane.setLeftAnchor(rect, 10d);
        anchorPane.getChildren().add(rect);

        EventHandler<MouseEvent> rectanguloPulsar = (MouseEvent event) -> {
            System.out.println("Source: rato, target: rectángulo, type: pulsar");
            System.out.println(event.getSceneX());
            System.out.println(event.getSceneY());
        };

        rect.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("source: "+event.getSource());
                System.out.println("target: "+event.getTarget());
                System.out.println("type: "+event.getEventType());
                System.out.println(event.getSceneX());
                System.out.println(event.getSceneY());
            }
        });
        anchorPane.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("source: "+event.getSource());
                System.out.println("target: "+event.getTarget());
                System.out.println("type: "+event.getEventType());
                System.out.println(event.getSceneX());
                System.out.println(event.getSceneY());
            }
        });



        Scene scene = new Scene(anchorPane, 200, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}