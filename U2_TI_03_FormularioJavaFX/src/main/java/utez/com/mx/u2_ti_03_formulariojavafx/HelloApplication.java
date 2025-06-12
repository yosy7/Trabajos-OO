package utez.com.mx.u2_ti_03_formulariojavafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        GridPane form = new GridPane();

        form.setAlignment(Pos.CENTER);
        form.setHgap(10);
        form.setVgap(10);

        Label lblNombre = new Label("Nombre");
        TextField tfNombre = new TextField();
        Label lblEdad = new Label("Edad");
        TextField tfEdad = new TextField();
        Label lblOpciones = new Label("Opciones");
        ObservableList<String> opciones = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> cmbOpciones = new ComboBox(opciones);
        Button btnCrear = new Button("Crear");
        Label lblResultado = new Label();

        btnCrear.setOnAction( e ->{
            String nombre = tfNombre.getText();
            String edad = tfEdad.getText();
            String seleccion = cmbOpciones.getSelectionModel().getSelectedItem();
            lblResultado.setStyle("-fx-text-fill:  green;");
            form.setStyle("-fx-background-color:  gray;");
            if(nombre.isEmpty() || edad.isEmpty() || seleccion == null){
                System.out.println("Todos los campos deben tener informacion");
                lblResultado.setText("Todos los campos deben tener informacion");

            }else{
                lblResultado.setText("Nombre: "+ nombre + "\nEdad: "+ edad + "\nOpcion: "+ seleccion);


            }
                });

        //GridPane form = new GridPane();

        //form.setAlignment(Pos.CENTER);
        //form.setHgap(10);
        //form.setVgap(10);

        form.add(lblNombre, 0, 0);
        form.add(tfNombre, 1, 0);
        form.add(lblEdad, 0, 1);
        form.add(tfEdad, 1, 1);
        form.add(lblOpciones, 0, 2);
        form.add(cmbOpciones, 1, 2);
        form.add(btnCrear, 0, 3);
        form.add(lblResultado, 1, 4);

        Scene scene = new Scene(form, 400, 300);




        stage.setTitle("FORMULARIO");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}