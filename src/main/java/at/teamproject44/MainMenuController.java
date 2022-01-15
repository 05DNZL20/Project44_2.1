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
        Parent root = FXMLLoader.load(getClass().getResource("PlayerOne.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship-Player1-Board");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage thisStage = (Stage) btn_startgame.getScene().getWindow();
        thisStage.close();
    }

    public void click_gamerules(ActionEvent actionEvent) {

        //Füge hier ein was bei den Spielregeln angezeigt werden soll
    }

    public void click_contacts(ActionEvent actionEvent) {

        //Füge hier ein was bei den Credits angezeigt werden soll
    }
}
