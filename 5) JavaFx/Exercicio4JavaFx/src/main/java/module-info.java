module org.example.exercicio4javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.exercicio4javafx to javafx.fxml;
    exports org.example.exercicio4javafx;
}