package at.teamproject44;


public class Gameboard {
    private Player player;
    Ship[][] board = new Ship[10][10];

    public boolean place = false;

    /*Gameboard:
    Konstruktor für die Klasse Gameboard.
    Erstellt ein neues Objekt vom Typ Gameboard und weißt es einem Spieler zu.
     */
    public Gameboard(Player p) {
        player = p;
    }

    /*place_ship_on_board(Schiffart, x_koordinate, y_koordinate, Ausrichtung_auf_Spielbrett):
    Platziert das Schiff auf dem Spielbrett.
    Ausrichtung: True ist vertikal.
                 False ist horizontal.
     */
    public boolean placeShipOnBoard(Ship ship, int x, int y, boolean alignment) {
        int length = ship.getType();
        if (x + length - 2 > 9 && !alignment) {
            System.out.println("Nicht mehr im Spielbereich");
            return false;
        } else if (y + length - 2 > 9 && alignment) {
            System.out.println("Nicht mehr im Spielbereich");
            return false;
        }
        if (!alignment) {
            for (int i = 0; i < length; i++) {
                if (x + i > 9) {
                    System.out.println("Out of Array Range");
                    return false;
                } else if (board[x + i][y] != null) {
                    System.out.println("Platz schon belegt");
                    return false;
                }
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (y + i > 9) {
                    System.out.println("Out of Array Range");
                    return false;
                }
                if (board[x][y + i] != null) {
                    System.out.println("Platz schon belegt");
                    return false;
                }
            }
        }
        if (!alignment) {
            for (int i = 0; i < length; i++) {
                if (x + i > 9) {
                    System.out.println("Out of Array Range");
                    return false;
                } else {
                    board[x + i][y] = ship;
                }
            }
            return true;
        } else {
            for (int i = 0; i < length; i++) {
                if (y + i > 9) {
                    System.out.println("Out of Array Range");
                    return false;
                } else {
                    board[x][y + i] = ship;
                }
            }

            return true;
        }
    }

}
