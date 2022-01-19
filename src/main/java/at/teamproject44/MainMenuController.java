package at.teamproject44;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/** JavaFx Implementierung des Startmenüs */

public class MainMenuController {

    @FXML
    private Button btn_startgame, btn_gamerules,btn_credits; //3 Buttons eingefügt

    private Parent root;

    //Mausklick auf "Start Game" führt dazu das "PlayerOne.fxml" aufgerufen wird und "MainMenu.fxml" geschlossen wird.
    public void click_startgame() throws IOException {
        root = FXMLLoader.load(getClass().getResource("PlayerOne.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship-Player1-Board");
        primaryStage.setScene(scene);
        primaryStage.show();

        ///Bei klick auf X (Rechts oben) wird die Methode reopen(Stage) aufgerufen um MainMenu.fxml zu öffnen.
        primaryStage.setOnCloseRequest(event -> {
            try {
                reopen();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Stage thisStage = (Stage) btn_startgame.getScene().getWindow();
        thisStage.close();
    }

    //Mausklick auf "Game Rules" führt dazu das "Gamerules.fxml" aufgerufen wird und "MainMenu.fxml" geschlossen wird.
    public void click_gamerules() throws IOException {
        root = FXMLLoader.load(getClass().getResource("Gamerules.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship-Game Rules");
        primaryStage.setScene(scene);
        primaryStage.show();

        ///Bei klick auf X (Rechts oben) wird die Methode reopen(Stage) aufgerufen um MainMenu.fxml zu öffnen.
        primaryStage.setOnCloseRequest(event -> {
            try {
                reopen();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        Stage thisStage = (Stage) btn_gamerules.getScene().getWindow();
        thisStage.close();
    }

    //Mausklick auf "Credits" führt dazu das "Credits.fxml" aufgerufen wird und "MainMenu.fxml" geschlossen wird.
    public void click_contacts() throws IOException {
        root = FXMLLoader.load(getClass().getResource("Credits.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship-Credits");
        primaryStage.setScene(scene);
        primaryStage.show();

        ///Bei klick auf X (Rechts oben) wird die Methode reopen(Stage) aufgerufen um MainMenu.fxml zu öffnen.
        primaryStage.setOnCloseRequest(event -> {
            try {
                reopen();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });


        Stage thisStage = (Stage) btn_credits.getScene().getWindow();
        thisStage.close();
    }

    //Methode wird verwendet um MainMenu.fxml wieder zu öffnen.
    private void reopen() throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
