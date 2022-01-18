package at.teamproject44;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/** JavaFx Implementierung des Startmenüs */

public class MainMenuController {

    @FXML
    Button btn_startgame, btn_gamerules, btn_contacs; //3 Buttons eingefügt

    public void click_startgame(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PlayerOne.fxml")); // GUI wird reingeladen
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship-Player1-Board"); //Player1 Fenster öffnet sich
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage thisStage = (Stage) btn_startgame.getScene().getWindow();
        thisStage.close(); //Startmenü wird geschlossen
    }

    public void click_gamerules(ActionEvent actionEvent) {

        // TODO: 15.01.2022
        /** Game Rules:
         * Firstly you type in your name, then place the ships.
         * You have 10 Ships to place, you can choose in which direction you want to put them.
         * The Game starts if both players are ready to play.
         * It is randomized which player starts.
         * If one player lands a hit, he has another try!
         * The game ends, if all ships of one player are destroyed.
         * Enjoy!
         */
    }

    public void click_contacts(ActionEvent actionEvent) {

        // TODO: 15.01.2022
        /**
         * Credits:
         * Project 44
         *
         * Teamleading & Development:
         * Julia Sosnowski
         *
         * Java Fx Design:
         * Safa Sik
         *
         * Development & Gameboard Guru:
         * Markus Wieger
         *
         * Development & Head of Organisation:
         * Merve Tuz
         *
         * Development & Organisation:
         * Abdulalim Yilmaz
         *
         * Development & Research:
         * Mohamad Tamim
         *
         * Github Repository for further information:
         * https://github.com/05DNZL20/Project44_2.1
         *
         */
    }
}
