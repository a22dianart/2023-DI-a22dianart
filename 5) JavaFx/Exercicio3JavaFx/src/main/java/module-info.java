module com.example.exercicio3javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercicio3javafx to javafx.fxml;
    exports com.example.exercicio3javafx;
}