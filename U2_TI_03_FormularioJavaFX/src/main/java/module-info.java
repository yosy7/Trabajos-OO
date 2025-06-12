module utez.com.mx.u2_ti_03_formulariojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens utez.com.mx.u2_ti_03_formulariojavafx to javafx.fxml;
    exports utez.com.mx.u2_ti_03_formulariojavafx;
}