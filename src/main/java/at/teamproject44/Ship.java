package at.teamproject44;

/* 1. Erstellung einer Schiffe Klasse mit folgenden Instanzvariablen:
Typ des Schiffs, Ausrichtung (Vertikal o. horizontal), Gesundheitszustand */


public class Ship {
    private int type;
    private boolean vertical;

    private int health;

    // Erstellung eines Schiff Konstruktors
    public Ship(int type, boolean vertical) {
        this.type = type;
        this.vertical = vertical;
        this.health = type;
    }

    // Methode Typ des Schiffes zu bekommen
    public int getType() {
        return type;
    }

    // Methode um Typ des Schiffes festzulegen
    public void setType(int type) {
        this.type = type;
    }
    // Methode um Ausrichtung des Schiffes zurückgeben
    public boolean isVertical() {
        return vertical;
    }
    // Methode die aufgerufen wird, wenn ein Schiff getroffen wird
    public void hit() {
        if (health != 0) {
            health--;
        }
    }
    // Methode um zurückzugeben, ob Schiff noch steht
    public boolean isShipAlive(){
        if (health > 0){
            return true;
        }
        else
        {
            return false;
        }
    }
}
