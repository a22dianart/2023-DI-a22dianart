
package com.example.exercicio3javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

public class ToggleButtonApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("");

        ToggleButton redOption = new RadioButton("Vermello");
        ToggleButton greenOption = new RadioButton("Verde");
        RadioButton blueOption = new RadioButton("Azul");

        ToggleGroup toggleGroup = new ToggleGroup();
        redOption.setToggleGroup(toggleGroup);
        greenOption.setToggleGroup(toggleGroup);
        blueOption.setToggleGroup(toggleGroup);



        Rectangle rectangle = new Rectangle(100, 50); // Ancho y alto del rectángulo
        rectangle.setFill(Color.WHITE); // Color de relleno del rectángulo
        rectangle.setStroke(Color.BLACK); // Color del borde del rectángulo

        // Asignar un evento al cambiar la selección del botón de radio
        toggleGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                RadioButton selectedRadioButton = (RadioButton) newValue;
                if(selectedRadioButton.getText()=="Vermello"){
                    rectangle.setFill(Color.RED); // Color de relleno del rectángulo

                }else if(selectedRadioButton.getText()=="Verde"){
                    rectangle.setFill(Color.GREEN); // Color de relleno del rectángulo

                }else{
                    rectangle.setFill(Color.BLUE); // Color de relleno del rectángulo

                }

            }
            else{
                rectangle.setFill(Color.WHITE); // Color de relleno del rectángulo

            }
        });
        


        VBox root = new VBox();

        root.getChildren().add(redOption);
        root.getChildren().add(greenOption);
        root.getChildren().add(blueOption);
        root.getChildren().add(rectangle);






        Scene scene = new Scene(root, 400, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}