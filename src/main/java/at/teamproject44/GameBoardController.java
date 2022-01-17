package at.teamproject44;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * JavaFx implemetierung des Gameboard grids
 */

public class GameBoardController implements Initializable {
    PlayerController pc = null;
    static Gameboard gameboardP1 = null;
    static Gameboard gameboardP2 = null;
    boolean turnP1 = true;

    private String messageHit = "Hit!";
    private String messageAlreadyShot = "Already shot!";
    private String messageMiss = "Miss!";
    private String messageNeighbor = "Can't place ship! Keep distance from other ships!";

    @FXML
    Rectangle re00, re01, re02, re03, re04, re05, re06, re07, re08, re09,
            re10, re11, re12, re13, re14, re15, re16, re17, re18, re19,
            re20, re21, re22, re23, re24, re25, re26, re27, re28, re29,
            re30, re31, re32, re33, re34, re35, re36, re37, re38, re39,
            re40, re41, re42, re43, re44, re45, re46, re47, re48, re49,
            re50, re51, re52, re53, re54, re55, re56, re57, re58, re59,
            re60, re61, re62, re63, re64, re65, re66, re67, re68, re69,
            re70, re71, re72, re73, re74, re75, re76, re77, re78, re79,
            re80, re81, re82, re83, re84, re85, re86, re87, re88, re89,
            re90, re91, re92, re93, re94, re95, re96, re97, re98, re99;
    @FXML
    Rectangle rp00, rp01, rp02, rp03, rp04, rp05, rp06, rp07, rp08, rp09,
            rp10, rp11, rp12, rp13, rp14, rp15, rp16, rp17, rp18, rp19,
            rp20, rp21, rp22, rp23, rp24, rp25, rp26, rp27, rp28, rp29,
            rp30, rp31, rp32, rp33, rp34, rp35, rp36, rp37, rp38, rp39,
            rp40, rp41, rp42, rp43, rp44, rp45, rp46, rp47, rp48, rp49,
            rp50, rp51, rp52, rp53, rp54, rp55, rp56, rp57, rp58, rp59,
            rp60, rp61, rp62, rp63, rp64, rp65, rp66, rp67, rp68, rp69,
            rp70, rp71, rp72, rp73, rp74, rp75, rp76, rp77, rp78, rp79,
            rp80, rp81, rp82, rp83, rp84, rp85, rp86, rp87, rp88, rp89,
            rp90, rp91, rp92, rp93, rp94, rp95, rp96, rp97, rp98, rp99;
    @FXML
    Label lbl_p1, lbl_p2, lbl_information, lbl_message;
    @FXML
    HBox hbx_ptwo1, hbx_ptwo2, hbx_ptwo3, hbx_ptwo4, hbx_ptwo5, hbx_ptwo6, hbx_ptwo7, hbx_ptwo8, hbx_ptwo9, hbx_ptwo10,
            hbx_pone1, hbx_pone2, hbx_pone3, hbx_pone4, hbx_pone5, hbx_pone6, hbx_pone7, hbx_pone8, hbx_pone9, hbx_pone10;

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
//Farbveränderungen der grids wenn getroffen/nicht getroffen
    //Wenn getroffen Feld=rot
    //Wenn nicht getroffen Feld=blau

    public void shotP1(MouseEvent event) {
        if (event.getSceneY() > 90 && event.getSceneY() <= 120) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re00.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re00.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re00.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 0) == 1) {
                    lbl_message.setText(messageHit);
                    re01.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re01.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re01.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re02.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re02.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re02.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re03.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re03.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re03.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re04.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re04.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re04.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re05.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re05.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re05.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re06.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re06.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re06.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re07.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re07.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re07.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re08.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re08.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re08.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 0) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re09.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 0) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re09.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re09.setDisable(true);
            }
        }
        else if (event.getSceneY() > 120 && event.getSceneY() <= 150) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re10.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re10.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re10.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re11.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re11.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re11.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re12.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re12.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re12.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re13.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re13.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re13.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re14.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re14.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re14.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re15.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re15.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re15.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re16.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re16.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re16.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re17.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re17.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re17.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re18.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re18.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re18.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 1) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re19.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 1) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re19.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re19.setDisable(true);
            }
        }
        else if (event.getSceneY() > 150 && event.getSceneY() <= 180) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re20.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re20.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re20.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re21.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re21.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re21.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re22.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re22.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re22.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re23.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re23.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re23.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re24.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re24.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re24.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re25.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re25.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re25.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re26.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re26.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re26.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re27.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re27.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re27.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re28.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re28.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re28.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 2) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re29.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 2) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re29.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re29.setDisable(true);
            }
        }
        else if (event.getSceneY() > 180 && event.getSceneY() <= 210) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 3) == 1 && re30.getFill() != Color.RED) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re30.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re30.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re30.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 3) == 1 && re31.getFill() != Color.RED) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re31.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re31.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re31.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 3) == 1 && re32.getFill() != Color.RED) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re32.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re32.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re32.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 3) == 1 && re33.getFill() != Color.RED) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re33.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re33.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re33.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 3) == 1 && re34.getFill() != Color.RED) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re34.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re34.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re34.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 3) == 1 && re35.getFill() != Color.RED) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re35.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re35.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re35.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 3) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re36.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re36.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re36.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 3) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re37.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re37.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re37.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 3) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re38.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re38.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re38.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 3) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re39.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 3) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re39.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re39.setDisable(true);
            }
        }
        else if (event.getSceneY() > 210 && event.getSceneY() <= 240) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re40.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re40.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re40.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re41.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re41.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re41.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re42.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re42.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re42.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 4) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re43.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re43.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re43.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 4) == 1 ){
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re44.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re44.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re44.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re45.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re45.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re45.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re46.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re46.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re46.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re47.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re47.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re47.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 4) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re48.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re48.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re48.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 4) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re49.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 4) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re49.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re49.setDisable(true);
            }
        }
        else if (event.getSceneY() > 240 && event.getSceneY() <= 270) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re50.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re50.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re50.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re51.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re51.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re51.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re52.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re52.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re52.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re53.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re53.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re53.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re54.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re54.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re54.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 5) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re55.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re55.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re55.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 5) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re56.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re56.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re56.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re57.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re57.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re57.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re58.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re58.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re58.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 5) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re59.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 5) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re59.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re59.setDisable(true);
            }
        }
        else if (event.getSceneY() > 270 && event.getSceneY() <= 300) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re60.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 6) == 1) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re60.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re60.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re61.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re61.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re61.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re62.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re62.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re62.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re63.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re63.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re63.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re64.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re64.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re64.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re65.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re65.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re65.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re66.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re66.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re66.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re67.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re67.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re67.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re68.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re68.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re68.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 6) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re69.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 6) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re69.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re69.setDisable(true);
            }
        }
        else if (event.getSceneY() > 300 && event.getSceneY() <= 330) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re70.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re70.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re70.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re71.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re71.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re71.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re72.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re72.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re72.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re73.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re73.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re73.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re74.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re74.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re74.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re75.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re75.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re75.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re76.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re76.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re76.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re77.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re77.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re77.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 7) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re78.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re78.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re78.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 7) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re79.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 7) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re79.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re79.setDisable(true);
            }
        }
        else if (event.getSceneY() > 330 && event.getSceneY() <= 360) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 8) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re80.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re80.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re80.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 8) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re81.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re81.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re81.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 8) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re82.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re82.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re82.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re83.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re83.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re83.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re84.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re84.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re84.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re85.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re85.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re85.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re86.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re86.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re86.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re87.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re87.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re87.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re88.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re88.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re88.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 8) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re89.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 8) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re89.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re89.setDisable(true);
            }
        }
        else if (event.getSceneY() > 360 && event.getSceneY() <= 430) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re90.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(0, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re90.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re90.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 9) == 1 ) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re91.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(1, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re91.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re91.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re92.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(2, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re92.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re92.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re93.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(3, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re93.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re93.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re94.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(4, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re94.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re94.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re95.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(5, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re95.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re95.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re96.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(6, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re96.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re96.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re97.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(7, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re97.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re97.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re98.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(8, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re98.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re98.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 9) == 1) {
                    lbl_message.setText(lbl_p2.getText() + ": "+messageHit);
                    re99.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    if (gameboardP1.hit(9, 9) == 0) {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageMiss);
                    } else {
                        lbl_message.setText(lbl_p2.getText() + ": "+messageAlreadyShot);
                    }
                    re99.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re99.setDisable(true);
            }
        }
    }
    public void shotP2(MouseEvent event) {
        if (event.getSceneY() > 440 && event.getSceneY() <= 470) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 0)==1) {
                    lbl_message.setText(lbl_p1.getText() + ": " + messageHit);
                    rp00.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp00.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp00.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp01.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp01.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp01.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp02.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp02.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp02.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp03.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp03.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp03.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp04.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp04.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp04.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp05.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp05.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp05.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp06.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp06.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp06.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp07.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp07.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp07.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp08.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp08.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp08.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 0)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp09.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,0)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp09.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp09.setDisable(true);
            }
        }
        else if (event.getSceneY() > 470 && event.getSceneY() <= 500) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp10.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp10.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp10.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp11.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp11.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp11.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp12.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp12.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp12.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp13.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp13.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp13.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp14.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp14.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp14.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp15.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp15.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp15.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp16.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp16.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp16.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp17.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp17.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp17.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp18.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp18.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp18.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 1)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp19.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,1)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp19.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp19.setDisable(true);
            }
        }
        else if (event.getSceneY() > 500 && event.getSceneY() <= 530) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp20.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp20.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp20.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp21.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp21.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp21.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp22.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp22.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp22.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp23.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp23.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp23.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp24.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp24.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp24.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp25.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp25.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp25.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp26.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp26.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp26.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp27.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp27.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp27.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp28.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp28.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp28.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 2)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp29.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,2)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp29.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp29.setDisable(true);
            }
        }
        else if (event.getSceneY() > 530 && event.getSceneY() <= 560) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp30.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp30.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp30.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp31.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp31.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp31.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp32.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp32.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp32.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp33.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp33.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp33.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp34.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp34.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp34.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp35.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp35.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp35.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp36.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp36.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp36.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp37.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp37.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp37.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp38.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp38.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp38.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 3)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp39.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,3)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp39.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp39.setDisable(true);
            }
        }
        else if (event.getSceneY() > 560 && event.getSceneY() <= 590) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp40.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp40.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp40.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp41.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp41.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp41.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp42.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp42.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp42.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp43.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp43.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp43.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp44.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp44.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp44.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp45.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp45.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp45.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp46.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp46.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp46.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp47.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp47.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp47.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp48.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp48.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp48.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 4)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp49.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,4)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp49.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp49.setDisable(true);
            }
        }
        else if (event.getSceneY() > 590 && event.getSceneY() <= 620) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp50.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp50.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp50.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp51.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp51.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp51.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp52.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp52.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp52.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp53.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp53.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp53.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp54.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp54.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp54.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp55.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp55.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp55.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp56.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp56.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp56.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp57.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp57.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp57.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp58.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp58.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp58.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 5)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp59.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,5)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp59.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp59.setDisable(true);
            }
        }
        else if (event.getSceneY() > 620 && event.getSceneY() <= 650) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp60.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp60.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp60.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp61.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp61.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp61.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp62.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp62.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp62.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp63.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp63.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp63.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp64.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp64.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp64.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp65.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp65.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp65.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp66.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp66.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp66.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp67.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp67.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp67.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp68.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp68.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp68.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 6)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp69.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,6)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp69.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp69.setDisable(true);
            }
        }
        else if (event.getSceneY() > 650 && event.getSceneY() <= 680) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 7)==1) {
                    lbl_message.setText(messageHit);
                    rp70.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp70.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp70.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp71.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp71.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp71.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp72.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp72.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp72.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp73.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp73.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp73.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp74.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp74.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp74.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp75.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp75.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp75.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp76.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp76.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp76.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp77.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp77.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp77.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp78.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp78.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp78.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 7)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp79.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,7)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp79.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp79.setDisable(true);
                turnP1 = true;
            }
        }
        else if (event.getSceneY() > 680 && event.getSceneY() <= 710) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp80.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp80.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp80.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp81.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp81.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp81.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp82.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp82.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp82.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp83.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp83.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp83.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp84.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp84.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp84.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp85.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp85.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp85.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp86.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp86.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp86.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp87.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp87.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp87.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp88.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp88.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp88.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 8)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp89.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,8)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp89.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp89.setDisable(true);
            }
        }
        else if (event.getSceneY() > 710 && event.getSceneY() <= 740) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp90.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(0,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp90.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp90.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp91.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(1,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp91.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp91.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp92.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(2,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp92.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp92.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp93.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(3,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp93.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp93.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp94.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(4,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp94.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp94.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp95.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(5,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp95.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp95.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp96.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(6,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp96.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp96.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 9)==1) {
                    lbl_message.setText(lbl_p1.getText()+": "+messageHit);
                    rp97.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(7,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp97.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp97.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 9)==1) {
                    rp98.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(8,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp98.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp98.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 9)==1) {
                    rp99.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    if (gameboardP2.hit(9,9)==0){
                        lbl_message.setText(lbl_p1.getText()+": "+messageMiss);
                    }else{
                        lbl_message.setText(lbl_p1.getText()+": "+messageAlreadyShot);
                    }
                    rp99.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp99.setDisable(true);
            }
        }
    }
    public void shot(MouseEvent event) {
        if (hbx_pone1.isDisable()) {
            shotP2(event);
            if (turnP1) {
                disableP1Board();
                enableP2Board();
            } else {
                enableP1Board();
                disableP2Board();
                lbl_information.setText(pc.getName2() + " is now shooting!");
            }
            if (gameboardP2.hasWonGame()){
                lbl_message.setText(lbl_p1.getText()+": Won the game!");
                disableP1Board();
                disableP2Board();
            }
        } else if (hbx_ptwo1.isDisable()) {
            shotP1(event);
            if (!turnP1) {
                enableP1Board();
                disableP2Board();
            } else {
                disableP1Board();
                enableP2Board();
                lbl_information.setText(pc.getName1() + " is now shooting!");
            }
            if (gameboardP1.hasWonGame()){
                lbl_message.setText(lbl_p2.getText()+": Won the game!");
                disableP1Board();
                disableP2Board();
            }
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pc = new PlayerController();
        gameboardP1 = pc.getPlayer1();
        gameboardP2 = pc.getPlayer2();
        lbl_p1.setText(pc.getName1());
        lbl_p2.setText(pc.getName2());
        lbl_information.setText(pc.getName1() + " is now shooting!");
    }
}
