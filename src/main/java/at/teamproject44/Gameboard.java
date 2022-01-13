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
        int length = ship.getType();

       /* if (!alignment){
            if (!checkVertical(length,x,y)){
                System.out.println("Nachbar");
                return false;
            }
        }else{
            if (!checkHorizontal(length,x,y)){
                System.out.println("Nachbar");
                return false;
            }
        }*/

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
    public boolean hit(int x, int y) {
        if (board[x][y] == null) {
            System.out.println("Leider nichts getroffen!");
            return false;
        } else if (board[x][y].equals(alreadyHit)) {
            System.out.println("Feld wurde schon beschossen!");
            return false;
        } else {
            board[x][y].hit();
            if (!board[x][y].isShipAlive()) {
                System.out.println("Ship destroyed!");
            }
            board[x][y] = alreadyHit;
            return true;
        }
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

        if (y == 9) {
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

        if (x == 9) {
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

        return true;
    }
}
