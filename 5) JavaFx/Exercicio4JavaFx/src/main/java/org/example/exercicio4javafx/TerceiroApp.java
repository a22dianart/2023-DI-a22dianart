package org.example.exercicio4javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TerceiroApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Terceiro");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));
        gridPane.setPrefWidth(400);
        gridPane.setPrefHeight(275);
        gridPane.setAlignment(Pos.CENTER);

        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        gridPane.add(b1,0,0);
        gridPane.add(b2,1,0);
        gridPane.add(b3,0, 1);
        gridPane.add(b4,1,1);

        Label label = new Label("");
        gridPane.add(label,0,3);

        EventHandler<MouseEvent> handler1 = (MouseEvent event) -> {
            Button source = (Button) event.getSource();
            label.setText("Boton "+source.getText()+ " pulsado");
        };

        b1.addEventHandler(MouseEvent.MOUSE_CLICKED, handler1);
        b2.addEventHandler(MouseEvent.MOUSE_CLICKED, handler1);
        b3.addEventHandler(MouseEvent.MOUSE_CLICKED, handler1);
        b4.addEventHandler(MouseEvent.MOUSE_CLICKED, handler1);



        Scene scene = new Scene(gridPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}