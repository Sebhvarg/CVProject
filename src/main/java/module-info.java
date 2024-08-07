module com.espol.cv.grupo7.cvprojectg07 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.espol.cv.grupo7.cvprojectg07 to javafx.fxml;
    exports com.espol.cv.grupo7.cvprojectg07;
}
