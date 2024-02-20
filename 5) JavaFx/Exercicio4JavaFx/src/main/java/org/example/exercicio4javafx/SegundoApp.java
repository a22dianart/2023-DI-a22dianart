package org.example.exercicio4javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class SegundoApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Segundo");
        HBox hbox = new HBox();
        ContextMenu menu = new ContextMenu();

        MenuItem item1 = new MenuItem("About");
        item1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("About");
            }
        });
        MenuItem item2 = new MenuItem("Preferences");
        item2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                System.out.println("Preferences");
            }
        });
        menu.getItems().addAll(item1, item2);

        hbox.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent e) {

                menu.show(hbox, e.getScreenX(), e.getScreenY());//IMPOERTANTE SENON SAE FORA DA PANTALLA
            }
        });



        Scene scene = new Scene(hbox, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}

