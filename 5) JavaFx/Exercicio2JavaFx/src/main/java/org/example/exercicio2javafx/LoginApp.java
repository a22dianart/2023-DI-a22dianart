package org.example.exercicio2javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

/*NON FUNCIONA BEN O COLSPAN */


public class LoginApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Login");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));
        gridPane.setPrefWidth(400);
        gridPane.setPrefHeight(275);
        gridPane.setAlignment(Pos.CENTER);

        Label welcomeLbl = new Label("Welcome");
        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 24);
        welcomeLbl.setFont(font);

        Button loginBtn= new Button("Login");

        Label userLbl = new Label("User name: ");
        Label passLbl = new Label("Password: ");
        TextField usertxt= new TextField("");
        TextField passtxt = new TextField("");

        HBox hbox = new HBox();
        hbox.getChildren().add(loginBtn);
        hbox.setAlignment(Pos.CENTER_RIGHT);

        Label texto = new Label("Pulsaches no boton");
        texto.setAlignment(Pos.CENTER);

        HBox hboxLogin = new HBox(texto);
        hbox.setAlignment(Pos.CENTER);




        loginBtn.setOnAction(value ->  {
            GridPane.setColumnSpan(hboxLogin,2 );
            gridPane.add(hboxLogin, 0, 4);

        });

        gridPane.add(welcomeLbl,0,0);
        gridPane.add(userLbl,0,1);
        gridPane.add(usertxt,1,1);
        gridPane.add(passLbl,0,2);



        GridPane.setColumnSpan(hbox,2 );
        gridPane.add(hbox, 0, 3);
        gridPane.setGridLinesVisible(true);


        Scene scene = new Scene(gridPane,400, 270);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}