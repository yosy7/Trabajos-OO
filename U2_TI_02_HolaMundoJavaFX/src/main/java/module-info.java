module utez.com.mx.u2_ti_02_holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens utez.com.mx.u2_ti_02_holamundojavafx to javafx.fxml;
    exports utez.com.mx.u2_ti_02_holamundojavafx;
}