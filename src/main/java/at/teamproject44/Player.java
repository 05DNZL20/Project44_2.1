package at.teamproject44;

/** Erstellung einer Player Klasse mit der Instanzvariable: Name */

public class Player {
    private String name;

    // Erstellung eines Konstruktors für den Player, holt sich Instanzvariable
    public Player(String name) {
        this.name = name;
    }

    //Erstellung einer Methode um den Namen des Players zu holen
    public String getName() {
        return name;
    }
}
