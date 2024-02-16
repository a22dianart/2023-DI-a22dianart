module org.example.exercicio1javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens org.example.exercicio1javafx to javafx.fxml;
    exports org.example.exercicio1javafx;
}