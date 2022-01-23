package at.teamproject44;

//Packages importieren
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

// Main Methode startet Game und Ablauf
//Klasse Application ist javafx.application
public class Main extends Application {

    //"MainMenu.fxml" wird aufgerufen.
    @Override// → Methode muss überschrieben werden
    //Methode heißt start und ist aus Klasse Application
    //Wird verwendet um das primäre Anwendungsfenster zu erzeugen Ist abstrakt
    public void start(Stage primaryStage) throws Exception{
        //Grafische Oberfläche MainMenu.fxml wird ins variable = root geladen
        //Datentype Parent ist ein Referenz-Datentype (Datentypen von Objekten werden groß geschrieben)
        Parent root = FXMLLoader.load(this.getClass().getResource("MainMenu.fxml")); // Spiel startet beim Main Menue
        //Referenz Datentype = Scene
        //Objekt von der Klasse Scene erstellen
        //new Scene(root) = Konstruktor aufrufen von der Klasse Scene
        Scene scene = new Scene(root);
        //Eine Stage ist im Prinzip ein Fenster, das als „Bühne“ für unseren Inhalt dient
        //Icon einfügen
        primaryStage.getIcons().add(new Image("at/teamproject44/Images/Battleship_icon.jpeg"));
        //Titel setzen
        primaryStage.setTitle("Battleship");
        //das Fenster soll eine feste größe haben
        primaryStage.setResizable(false);
        //Szene setzen
        primaryStage.setScene(scene);
        //Eine Stage wird mit Aufruf der Methode show()sichtbar
        primaryStage.show();
    }
    //Methode main
    // launch(args) Method is inside the application class
    public static void main(String[] args) {
        launch(args);
    }
}
