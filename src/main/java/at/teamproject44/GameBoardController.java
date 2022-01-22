package at.teamproject44;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * JavaFx implemetierung des Gameboard grids
 */

public class GameBoardController implements Initializable {
    @FXML
    private Label lbl_p1, lbl_p2, lbl_information, lbl_message, lbl_ShipsPlayer1, lbl_ShipsPlayer2;
    @FXML
    private HBox hbx_ptwo1, hbx_ptwo2, hbx_ptwo3, hbx_ptwo4, hbx_ptwo5, hbx_ptwo6, hbx_ptwo7, hbx_ptwo8, hbx_ptwo9, hbx_ptwo10,
            hbx_pone1, hbx_pone2, hbx_pone3, hbx_pone4, hbx_pone5, hbx_pone6, hbx_pone7, hbx_pone8, hbx_pone9, hbx_pone10;
    @FXML
    private Button btn_restart;

    private PlayerController pc = null;
    private static Gameboard gameboardP1 = null;
    private static Gameboard gameboardP2 = null;
    private boolean turnP1;
    private Parent root;
    private int x, y;

    private final String messageHit = "Hit!";
    private final String messageMiss = "Miss!";
    private final String messageShipDestroyed = "Destroyed\na Ship!";


    private void setTurnP1(boolean turnP1) {
        this.turnP1 = turnP1;
    }

    //Wir Disablen/Enablen jeweils die Gameboard, damit man nicht auf das falsche Feld schießt.
    private void disableP1Board() {
        hbx_pone1.setDisable(true);
        hbx_pone2.setDisable(true);
        hbx_pone3.setDisable(true);
        hbx_pone4.setDisable(true);
        hbx_pone5.setDisable(true);
        hbx_pone6.setDisable(true);
        hbx_pone7.setDisable(true);
        hbx_pone8.setDisable(true);
        hbx_pone9.setDisable(true);
        hbx_pone10.setDisable(true);
    }

    private void disableP2Board() {
        hbx_ptwo1.setDisable(true);
        hbx_ptwo2.setDisable(true);
        hbx_ptwo3.setDisable(true);
        hbx_ptwo4.setDisable(true);
        hbx_ptwo5.setDisable(true);
        hbx_ptwo6.setDisable(true);
        hbx_ptwo7.setDisable(true);
        hbx_ptwo8.setDisable(true);
        hbx_ptwo9.setDisable(true);
        hbx_ptwo10.setDisable(true);
    }

    private void enableP1Board() {
        hbx_pone1.setDisable(false);
        hbx_pone2.setDisable(false);
        hbx_pone3.setDisable(false);
        hbx_pone4.setDisable(false);
        hbx_pone5.setDisable(false);
        hbx_pone6.setDisable(false);
        hbx_pone7.setDisable(false);
        hbx_pone8.setDisable(false);
        hbx_pone9.setDisable(false);
        hbx_pone10.setDisable(false);
    }

    private void enableP2Board() {
        hbx_ptwo1.setDisable(false);
        hbx_ptwo2.setDisable(false);
        hbx_ptwo3.setDisable(false);
        hbx_ptwo4.setDisable(false);
        hbx_ptwo5.setDisable(false);
        hbx_ptwo6.setDisable(false);
        hbx_ptwo7.setDisable(false);
        hbx_ptwo8.setDisable(false);
        hbx_ptwo9.setDisable(false);
        hbx_ptwo10.setDisable(false);
    }

    //X und Y-Koordinaten für Hit Methode bekommen
    private void getXandYBoardP1(MouseEvent event) {
        if (event.getSceneY() > 89 && event.getSceneY() < 120) {
            y = 0;
        } else if (event.getSceneY() > 119 && event.getSceneY() < 150) {
            y = 1;
        } else if (event.getSceneY() > 149 && event.getSceneY() < 180) {
            y = 2;
        } else if (event.getSceneY() > 179 && event.getSceneY() < 210) {
            y = 3;
        } else if (event.getSceneY() > 209 && event.getSceneY() < 240) {
            y = 4;
        } else if (event.getSceneY() > 239 && event.getSceneY() < 270) {
            y = 5;
        } else if (event.getSceneY() > 269 && event.getSceneY() < 300) {
            y = 6;
        } else if (event.getSceneY() > 299 && event.getSceneY() < 330) {
            y = 7;
        } else if (event.getSceneY() > 329 && event.getSceneY() < 360) {
            y = 8;
        } else if (event.getSceneY() > 359 && event.getSceneY() < 430) {
            y = 9;
        }

        if (event.getSceneX() > 69 && event.getSceneX() < 100) {
            x = 0;
        } else if (event.getSceneX() > 99 && event.getSceneX() < 130) {
            x = 1;
        } else if (event.getSceneX() > 129 && event.getSceneX() < 160) {
            x = 2;
        } else if (event.getSceneX() > 159 && event.getSceneX() < 190) {
            x = 3;
        } else if (event.getSceneX() > 189 && event.getSceneX() < 220) {
            x = 4;
        } else if (event.getSceneX() > 219 && event.getSceneX() < 250) {
            x = 5;
        } else if (event.getSceneX() > 249 && event.getSceneX() < 280) {
            x = 6;
        } else if (event.getSceneX() > 279 && event.getSceneX() < 310) {
            x = 7;
        } else if (event.getSceneX() > 309 && event.getSceneX() < 340) {
            x = 8;
        } else if (event.getSceneX() > 339 && event.getSceneX() < 410) {
            x = 9;
        }
    }
    private void getXandYBoardP2(MouseEvent event) {
        if (event.getSceneY() > 438 && event.getSceneY() <= 467) {
            y = 0;
        } else if (event.getSceneY() > 468 && event.getSceneY() <= 497) {
            y = 1;
        } else if (event.getSceneY() > 498 && event.getSceneY() <= 527) {
            y = 2;
        } else if (event.getSceneY() > 528 && event.getSceneY() <= 557) {
            y = 3;
        } else if (event.getSceneY() > 558 && event.getSceneY() <= 587) {
            y = 4;
        } else if (event.getSceneY() > 588 && event.getSceneY() <= 617) {
            y = 5;
        } else if (event.getSceneY() > 618 && event.getSceneY() <= 647) {
            y = 6;
        } else if (event.getSceneY() > 648 && event.getSceneY() <= 677) {
            y = 7;
        } else if (event.getSceneY() > 678 && event.getSceneY() <= 707) {
            y = 8;
        } else if (event.getSceneY() > 708 && event.getSceneY() <= 737) {
            y = 9;
        }

        if (event.getSceneX() > 69 && event.getSceneX() < 100) {
            x = 0;
        } else if (event.getSceneX() > 99 && event.getSceneX() < 130) {
            x = 1;
        } else if (event.getSceneX() > 129 && event.getSceneX() < 160) {
            x = 2;
        } else if (event.getSceneX() > 159 && event.getSceneX() < 190) {
            x = 3;
        } else if (event.getSceneX() > 189 && event.getSceneX() < 220) {
            x = 4;
        } else if (event.getSceneX() > 219 && event.getSceneX() < 250) {
            x = 5;
        } else if (event.getSceneX() > 249 && event.getSceneX() < 280) {
            x = 6;
        } else if (event.getSceneX() > 279 && event.getSceneX() < 310) {
            x = 7;
        } else if (event.getSceneX() > 309 && event.getSceneX() < 340) {
            x = 8;
        } else if (event.getSceneX() > 339 && event.getSceneX() < 410) {
            x = 9;
        }
    }


//Farbveränderungen der grids wenn getroffen/nicht getroffen
    //Wenn getroffen Feld=rot
    //Wenn nicht getroffen Feld=blau
    public void shot(MouseEvent event) {
        Rectangle re = (Rectangle) event.getSource();
        if (turnP1) { //Wenn die zeilen von Player 1 disabled
            getXandYBoardP2(event); // Wird Event eröffnet das Player 2 geschossen wird

            if (gameboardP2.hit(x, y)) {
                lbl_message.setTextFill(Color.rgb(26, 255, 0));
                lbl_message.setText(lbl_p1.getText() + ": " + messageHit);
                re.setFill(Color.RED);
                turnP1 = true;
                disableP1Board(); // Dann kann man nicht auf Player 1 board klicken
                enableP2Board(); // Sondern nur auf Player 2 Board schießen

                if (gameboardP2.getDestroyedShips() == 1) {
                    lbl_message.setTextFill(Color.rgb(26, 255, 0));
                    lbl_message.setText(lbl_p1.getText() + ": " + messageShipDestroyed);
                    lbl_ShipsPlayer2.setText(lbl_p2.getText() + " has\n" + (10 - gameboardP2.getCounter()) + " ship(s) left!");

                    if (gameboardP2.hasWonGame()) {
                        lbl_message.setUnderline(true);
                        lbl_message.setText(lbl_p1.getText() + ": Won the game!");
                        disableP1Board();
                        disableP2Board();
                        btn_restart.setVisible(true);
                    }
                }
            }
            else {
                lbl_message.setTextFill(Color.RED);
                lbl_message.setText(lbl_p1.getText() + ": " + messageMiss);
                re.setFill(Color.BLUE);
                turnP1 = false;
                enableP1Board();
                disableP2Board();
                lbl_information.setText(pc.getName2() + " is now shooting!");
            }
            re.setDisable(true);
        }
        else {
            getXandYBoardP1(event);
            if (gameboardP1.hit(x, y)) {
                lbl_message.setTextFill(Color.rgb(26, 255, 0));
                lbl_message.setText(lbl_p2.getText() + ": " + messageHit);
                re.setFill(Color.RED);
                turnP1 = false;
                enableP1Board();
                disableP2Board();
                if (gameboardP1.getDestroyedShips() == 1) {
                    lbl_message.setTextFill(Color.rgb(26, 255, 0));
                    lbl_message.setText(lbl_p2.getText() + ": " + messageShipDestroyed);
                    lbl_ShipsPlayer1.setText(lbl_p1.getText() + " has\n" + (10 - gameboardP1.getCounter()) + " ship(s) left!");
                    if (gameboardP1.hasWonGame()) {
                        lbl_message.setUnderline(true);
                        lbl_message.setText(lbl_p2.getText() + ": Won the game!");
                        disableP1Board();
                        disableP2Board();
                        btn_restart.setVisible(true);
                    }
                }
            }
            else {
                lbl_message.setTextFill(Color.RED);
                lbl_message.setText(lbl_p2.getText() + ": " + messageMiss);
                re.setFill(Color.BLUE);
                turnP1 = true;
                disableP1Board();
                enableP2Board();
                lbl_information.setText(pc.getName1() + " is now shooting!");
            }
            re.setDisable(true);
        }

    }

    public void click_restart() throws IOException {
        root = FXMLLoader.load(getClass().getResource("PlayerOne.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.getIcons().add(new Image("at/teamproject44/Images/Battleship_icon.jpeg"));
        primaryStage.setTitle("Battleship-Player1 Board");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

        ///Bei klick auf X (Rechts oben) wird die Methode reopen() aufgerufen um MainMenu.fxml zu öffnen.
        primaryStage.setOnCloseRequest(event -> {
            try {
                reopen();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        Stage thisStage = (Stage) btn_restart.getScene().getWindow();
        thisStage.close();
    }

    //Methode wird verwendet um MainMenu.fxml wieder zu öffnen.
    private void reopen() throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.getIcons().add(new Image("at/teamproject44/Images/Battleship_icon.jpeg"));
        primaryStage.setTitle("Battleship");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //"initialize" wird sofort ausgeführt, wenn sich "GameBoard.fxml" öffnet.
    //Da weisen wir den Variablen Werte zu und setzen Texte für die Label.
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pc = new PlayerController();
        gameboardP1 = pc.getPlayer1();
        gameboardP2 = pc.getPlayer2();
        lbl_p1.setText(pc.getName1());
        lbl_p2.setText(pc.getName2());
        if  (Math.random() < 0.5){
            setTurnP1(true);
            lbl_information.setText(pc.getName1() + " is now shooting!");
            disableP1Board();
            enableP2Board();
        }else{
            setTurnP1(false);
            lbl_information.setText(pc.getName2() + " is now shooting!");
            enableP1Board();
            disableP2Board();
        }
        lbl_ShipsPlayer1.setText(lbl_p1.getText() + " has\n" + (10 - gameboardP1.getDestroyedShips()) + " ship(s) left!");
        lbl_ShipsPlayer2.setText(lbl_p2.getText() + " has\n" + (10 - gameboardP2.getDestroyedShips()) + " ship(s) left!");
    }
}
