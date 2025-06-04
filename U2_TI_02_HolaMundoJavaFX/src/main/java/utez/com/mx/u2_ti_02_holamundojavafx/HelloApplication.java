package utez.com.mx.u2_ti_02_holamundojavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label Mylabel = new Label("Yoselinne Mundo");
        StackPane root = new StackPane(Mylabel);
        Scene scene = new Scene(root, 200, 200);
        //Scene scene2 = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Prueba");

        Image image = new Image(getClass().getResourceAsStream("/images/hogar.png"));
        stage.getIcons().add(image);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}