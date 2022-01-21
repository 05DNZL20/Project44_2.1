package at.teamproject44;

/*
Index of Gameboard:

    0|1|2|3|4|5|6|7|8|9
  0|_|_|_|_|_|_|_|_|_|_|
  1|_|_|_|_|_|_|_|_|_|_|
  2|_|_|_|_|_|_|_|_|_|_|
  3|_|_|_|_|_|_|_|_|_|_|
  4|_|_|_|_|_|_|_|_|_|_|
  5|_|_|_|_|_|_|_|_|_|_|
  6|_|_|_|_|_|_|_|_|_|_|
  7|_|_|_|_|_|_|_|_|_|_|
  8|_|_|_|_|_|_|_|_|_|_|
  9|_|_|_|_|_|_|_|_|_|_|

 */
public class Gameboard {
    private Player player;
    private Ship[][] board = new Ship[10][10];
    private Ship alreadyHit = new Ship(25, true);
    private int Error;
    //Variable um zerstörte Schiffe zu zählen
    private int counter = 0;

    /**
     * Gameboard:
     * Konstruktor für die Klasse Gameboard.
     * Erstellt ein neues Objekt vom Typ Gameboard und weißt es einem Spieler zu.
     *
     * @param p Spieler dem das Brett gehört.
     */
    public Gameboard(Player p) {
        player = p;
    }

    public int getError() {
        return Error;
    }

    /**
     * place_ship_on_board(Schiffart, x_koordinate, y_koordinate, Ausrichtung_auf_Spielbrett):
     * Platziert das Schiff auf dem Spielbrett.
     * Ausrichtung: True ist vertikal.
     * False ist horizontal.
     *
     * @param ship      Schiff das platziert wird.
     * @param x         X_Koordinate.
     * @param y         Y_Koordinate.
     * @param alignment True wenn das Schiff vertical platziert wird.
     * @return Wenn das Schiff platziert werden kann true sonst false.
     */

    public boolean placeShipOnBoard(Ship ship, int x, int y, boolean alignment) {
        Error = 0;
        int length = ship.getType();
        if (x + length - 1 > 9 && !alignment) {
            Error = 1;
            return false; // Nicht im Spielfeld
        } else if (y + length - 1 > 9 && alignment) {
            Error = 1;
            return false; // Nicht im Spielfeld
        }
        if (!alignment) { //horizontal
            for (int i = 0; i < length; i++) {
                if (board[x + i][y] != null) {
                    Error = 2;
                    return false; // Platz schon belegt
                }
            }
        } else { //vertikal
            for (int i = 0; i < length; i++) {
                if (board[x][y + i] != null) {
                    Error = 2;
                    return false; // Platz schon belegt

                }
            }
        }

        if (alignment) {
            if (!checkVertical(length, x, y)) {
                Error = 3;
                return false; //Fehler: Nachbar
            }
        } else {
            if (!checkHorizontal(length, x, y)) {
                Error = 3;
                return false; //Fehler: Nachbar
            }
        }

        if (!alignment) { //horizontal
            for (int i = 0; i < length; i++) {
                board[x + i][y] = ship;
            }
            return true; //erfolgreich

        } else { //vertikal
            for (int i = 0; i < length; i++) {
                board[x][y + i] = ship;
            }
            return true; //erfolgreich
        }
    }

    /**
     * Hit:
     * Sieht nach ob die angezielte Stelle mit einem Schiff belegt ist.
     * Falls ja wird dem Schiff ein Leben abgezogen und mit einem Dummy Schiff ersetzt und es wird true zurückgeliefert.
     * Falls schon ein Dummy Schiff auf der Stelle liegt wird false zurückgeliefert.
     * Falls kein Schiff an der Stelle ist wird false zurückgeliefert.
     *
     * @param x X_Koordinate
     * @param y Y_Koordinate
     * @return Liefert bei Treffer true zurück sonst false
     */
    public int hit(int x, int y) {
        if (board[x][y] == null) {
            return 0;
        } else if (board[x][y].equals(alreadyHit)) {
            return 2;
        } else {
            board[x][y].hit();
            if (!board[x][y].isShipAlive()) {
                System.out.println("Ship destroyed!");
                counter++;
            }
            board[x][y] = alreadyHit;
            return 1;
        }
    }

    // Methode um zurückzugeben, ob ein Player gewonnen hat
    public boolean hasWonGame() {

        if (counter == 10) {
            return true;
        }
        return false;
    }

    /**
     * checkVertical:
     * Überprüft bei einem verticalen Schiff ob neben dem zu platzierenden Schiff keine anderen Schiffe liegen.
     *
     * @param type Schiffart - Länge
     * @param x    X_Koordinate
     * @param y    Y_Koordinate
     * @return Liefert true zurück wenn das Schiff platziert werden kann sonst false.
     */
    private boolean checkVertical(int type, int x, int y) {
        if (x == 9) {
            for (int i = 0; i < type; i++) {
                if (board[x - 1][y + i] != null) {
                    return false;
                }
            }
        } else if (x == 0) {
            for (int i = 0; i < type; i++) {
                if (board[x + 1][y + i] != null) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < type; i++) {
                if (board[x - 1][y + i] != null) {
                    return false;
                } else if (board[x + 1][y + i] != null) {
                    return false;
                }
            }
        }

        if (y + type - 1 == 9) {
            if (board[x][y - 1] != null) {
                return false;
            }
        } else if (y == 0) {
            if (board[x][y + type] != null) {
                return false;
            }
        } else {
            if (board[x][y - 1] != null) {
                return false;
            } else if (board[x][y + type] != null) {
                return false;
            }
        }
        if (y == 0 && x == 0) {
            if (board[x + 1][y + type] != null) {
                return false;
            }
        } else if (y == 0 && x == 9) {
            if (board[x - 1][y + type] != null) {
                return false;
            }
        } else if (x == 0 && y + type - 1 == 9) {
            if (board[x + 1][y - 1] != null) {
                return false;
            }
        } else if (x == 9 && y + type - 1 == 9) {
            if (board[x - 1][y - 1] != null) {
                return false;
            }
        } else if (y == 0) {
            if (board[x - 1][y + type] != null) {
                return false;
            } else if (board[x + 1][y + type] != null) {
                return false;
            }
        } else if (y + type - 1 == 9) {
            if (board[x - 1][y - 1] != null) {
                return false;
            } else if (board[x + 1][y - 1] != null) {
                return false;
            }
        } else if (x == 0) {
            if (board[x + 1][y - 1] != null) {
                return false;
            } else if (board[x + 1][y + type] != null) {
                return false;
            }
        } else if (x == 9) {
            if (board[x - 1][y - 1] != null) {
                return false;
            } else if (board[x - 1][y + type] != null) {
                return false;
            }
        } else {
            if (board[x - 1][y - 1] != null) {
                return false;
            } else if (board[x + 1][y - 1] != null) {
                return false;
            } else if (board[x - 1][y + type] != null) {
                return false;
            } else if (board[x + 1][y + type] != null) {
                return false;
            }
        }

        return true;
    }

    /**
     * checkHorizontal:
     * Überprüft bei einem horizontalen Schiff ob neben dem zu platzierenden Schiff keine anderen Schiffe liegen.
     *
     * @param type Schiffart - Länge
     * @param x    X_Koordinate
     * @param y    Y_Koordinate
     * @return Liefert true zurück wenn das Schiff platziert werden kann sonst false.
     */

    private boolean checkHorizontal(int type, int x, int y) {
        if (y == 9) {
            for (int i = 0; i < type; i++) {
                if (board[x + i][y - 1] != null) {
                    return false;
                }
            }
        } else if (y == 0) {
            for (int i = 0; i < type; i++) {
                if (board[x + i][y + 1] != null) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < type; i++) {
                if (board[x + i][y - 1] != null) {
                    return false;
                } else if (board[x + i][y + 1] != null) {
                    return false;
                }
            }
        }

        if (x + type - 1 == 9) {
            if (board[x - 1][y] != null) {
                return false;
            }
        } else if (x == 0) {
            if (board[x + type][y] != null) {
                return false;
            }
        } else {
            if (board[x - 1][y] != null) {
                return false;
            } else if (board[x + type][y] != null) {
                return false;
            }
        }

        //Checkt die Ecken
        if (y == 0 && x == 0) {
            if (board[x + type][y + 1] != null) {
                return false;
            }
        } else if (y == 0 && x + type - 1 == 9) {
            if (board[x - 1][y + 1] != null) {
                return false;
            }
        } else if (x == 0 && y == 9) {
            if (board[x + type][y - 1] != null) {
                return false;
            }
        } else if (x + type - 1 == 9 && y == 9) {
            if (board[x - 1][y - 1] != null) {
                return false;
            }
        } else if (y == 0) {
            if (board[x - 1][y + 1] != null) {
                return false;
            } else if (board[x + type][y + 1] != null) {
                return false;
            }
        } else if (y == 9) {
            if (board[x - 1][y - 1] != null) {
                return false;
            } else if (board[x + type][y - 1] != null) {
                return false;
            }
        } else if (x == 0) {
            if (board[x + type][y + 1] != null) {
                return false;
            } else if (board[x + type][y - 1] != null) {
                return false;
            }
        } else if (x + type - 1 == 9) {
            if (board[x - 1][y - 1] != null) {
                return false;
            } else if (board[x - 1][y + 1] != null) {
                return false;
            }
        } else {
            if (board[x - 1][y - 1] != null) {
                return false;
            } else if (board[x - 1][y + 1] != null) {
                return false;
            } else if (board[x + type][y - 1] != null) {
                return false;
            } else if (board[x + type][y + 1] != null) {
                return false;
            }
        }

        return true;
    }
}
