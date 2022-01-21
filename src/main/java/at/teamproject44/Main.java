package at.teamproject44;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

// Main Methode startet Game und Ablauf
public class Main extends Application {

    //"MainMenu.fxml" wird aufgerufen.
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(this.getClass().getResource("MainMenu.fxml")); // Spiel startet beim Main Menue
        Scene scene = new Scene(root);
        primaryStage.getIcons().add(new Image("at/teamproject44/Images/Battleship_icon.jpeg"));
        primaryStage.setTitle("Battleship");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); //Ruft start() Methode auf
    }
}
