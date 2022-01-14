package at.teamproject44;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/*Hello, dear colleagues!
We are in the process of making a battleship game.
This is our project so far, it isn't complete, but you can start the game and place your ships.
Have fun while trying out what we have so far!
You can run the project with: View > Tool Windows > Gradle > Tasks > application > run

Sincerely,
the team from "Project 44"
*/


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(this.getClass().getResource("MainMenu.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Battleship");
            primaryStage.setScene(scene);
            primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
