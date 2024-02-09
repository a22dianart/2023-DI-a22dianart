package org.example.exercicio2javafx;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

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

        HBox hbox = new HBox(loginBtn);
        hbox.setAlignment(Pos.BOTTOM_RIGHT);

        Label texto = new Label("Pulsaches no boton");

        HBox hboxLogin = new HBox(texto);
        hbox.setAlignment(Pos.CENTER);




        loginBtn.setOnAction(value ->  {
            GridPane.setColumnSpan(hboxLogin,2 );
            GridPane.setConstraints(hboxLogin, 0, 4);
            gridPane.getChildren().add(hboxLogin);

        });

        GridPane.setConstraints(welcomeLbl, 0, 0);
        GridPane.setConstraints(userLbl, 0, 1);
        GridPane.setConstraints(usertxt, 1,1);
        GridPane.setConstraints(passLbl, 0, 2);
        GridPane.setConstraints(passtxt,1, 2);
        GridPane.setColumnSpan(hbox,2 );
        GridPane.setConstraints(hbox,0, 3);
        gridPane.setGridLinesVisible(true);


        gridPane.getChildren().addAll(welcomeLbl, hbox, userLbl, passLbl, usertxt, passtxt);

        Scene scene = new Scene(gridPane,400, 270);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}