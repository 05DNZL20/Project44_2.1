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

public class GameBoardController implements Initializable {
    PlayerController pc = null;
    static Gameboard gameboardP1 = null;
    static Gameboard gameboardP2 = null;

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
    Label lbl_p1, lbl_p2, lbl_information;

    @FXML
    HBox hbx_ptwo1, hbx_ptwo2, hbx_ptwo3, hbx_ptwo4, hbx_ptwo5, hbx_ptwo6, hbx_ptwo7, hbx_ptwo8, hbx_ptwo9, hbx_ptwo10,
            hbx_pone1, hbx_pone2, hbx_pone3, hbx_pone4, hbx_pone5, hbx_pone6, hbx_pone7, hbx_pone8, hbx_pone9, hbx_pone10;

    boolean turnP1 = true;

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

    public void shotP1(MouseEvent event) {
        if (event.getSceneY() > 90 && event.getSceneY() <= 120) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 0)) {
                    re00.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re00.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re00.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 0)) {
                    re01.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re01.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re01.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 0)) {
                    re02.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re02.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re02.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 0)) {
                    re03.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re03.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re03.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 0)) {
                    re04.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re04.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re04.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 0)) {
                    re05.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re05.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re05.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 0)) {
                    re06.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re06.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re06.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 0)) {
                    re07.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re07.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re07.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 0)) {
                    re08.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re08.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re08.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 0)) {
                    re09.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re09.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re09.setDisable(true);
            }
        }
        if (event.getSceneY() > 120 && event.getSceneY() <= 150) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 1)) {
                    re10.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re10.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re10.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 1)) {
                    re11.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re11.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re11.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 1)) {
                    re12.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re12.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re12.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 1)) {
                    re13.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re13.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re13.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 1)) {
                    re14.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re14.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re14.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 1)) {
                    re15.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re15.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re15.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 1)) {
                    re16.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re16.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re16.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 1)) {
                    re17.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re17.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re17.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 1)) {
                    re18.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re18.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re18.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 1)) {
                    re19.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re19.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re19.setDisable(true);
            }
        }
        if (event.getSceneY() > 150 && event.getSceneY() <= 180) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 2)) {
                    re20.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re20.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re20.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 2)) {
                    re21.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re21.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re21.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 2)) {
                    re22.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re22.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re22.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 2)) {
                    re23.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re23.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re23.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 2)) {
                    re24.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re24.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re24.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 2)) {
                    re25.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re25.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re25.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 2)) {
                    re26.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re26.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re26.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 2)) {
                    re27.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re27.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re27.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 2)) {
                    re28.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re28.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re28.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 2)) {
                    re29.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re29.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re29.setDisable(true);
            }
        }
        if (event.getSceneY() > 180 && event.getSceneY() <= 210) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 3)) {
                    re30.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re30.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re30.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 3)) {
                    re31.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re31.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re31.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 3)) {
                    re32.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re32.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re32.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 3)) {
                    re33.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re33.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re33.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 3)) {
                    re34.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re34.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re34.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 3)) {
                    re35.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re35.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re35.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 3)) {
                    re36.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re36.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re36.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 3)) {
                    re37.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re37.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re37.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 3)) {
                    re38.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re38.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re38.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 3)) {
                    re39.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re39.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re39.setDisable(true);
            }
        }
        if (event.getSceneY() > 210 && event.getSceneY() <= 240) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 4)) {
                    re40.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re40.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re40.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 4)) {
                    re41.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re41.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re41.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 4)) {
                    re42.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re42.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re42.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 4)) {
                    re43.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re43.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re43.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 4)) {
                    re44.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re44.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re44.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 4)) {
                    re45.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re45.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re45.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 4)) {
                    re46.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re46.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re46.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 4)) {
                    re47.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re47.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re47.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 4)) {
                    re48.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re48.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re48.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 4)) {
                    re49.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re49.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re49.setDisable(true);
            }
        }
        if (event.getSceneY() > 240 && event.getSceneY() <= 270) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 5)) {
                    re50.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re50.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re50.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 5)) {
                    re51.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re51.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re51.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 5)) {
                    re52.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re52.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re52.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 5)) {
                    re53.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re53.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re53.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 5)) {
                    re54.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re54.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re54.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 5)) {
                    re55.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re55.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re55.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 5)) {
                    re56.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re56.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re56.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 5)) {
                    re57.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re57.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re57.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 5)) {
                    re58.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re58.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re58.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 5)) {
                    re59.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re59.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re59.setDisable(true);
            }
        }
        if (event.getSceneY() > 270 && event.getSceneY() <= 300) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 6)) {
                    re60.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re60.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re60.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 6)) {
                    re61.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re61.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re61.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 6)) {
                    re62.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re62.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re62.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 6)) {
                    re63.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re63.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re63.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 6)) {
                    re64.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re64.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re64.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 6)) {
                    re65.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re65.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re65.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 6)) {
                    re66.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re66.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re66.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 6)) {
                    re67.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re67.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re67.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 6)) {
                    re68.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re68.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re68.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 6)) {
                    re69.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re69.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re69.setDisable(true);
            }
        }
        if (event.getSceneY() > 300 && event.getSceneY() <= 330) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 7)) {
                    re70.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re70.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re70.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 7)) {
                    re71.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re71.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re71.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 7)) {
                    re72.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re72.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re72.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 7)) {
                    re73.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re73.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re73.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 7)) {
                    re74.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re74.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re74.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 7)) {
                    re75.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re75.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re75.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 7)) {
                    re76.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re76.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re76.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 7)) {
                    re77.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re77.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re77.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 7)) {
                    re78.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re78.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re78.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 7)) {
                    re79.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re79.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re79.setDisable(true);
            }
        }
        if (event.getSceneY() > 330 && event.getSceneY() <= 360) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 8)) {
                    re80.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re80.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re80.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 8)) {
                    re81.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re81.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re81.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 8)) {
                    re82.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re82.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re82.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 8)) {
                    re83.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re83.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re83.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 8)) {
                    re84.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re84.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re84.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 8)) {
                    re85.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re85.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re85.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 8)) {
                    re86.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re86.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re86.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 8)) {
                    re87.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re87.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re87.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 8)) {
                    re88.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re88.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re88.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 8)) {
                    re89.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re89.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re89.setDisable(true);
            }
        }
        if (event.getSceneY() > 360 && event.getSceneY() <= 430) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP1.hit(0, 9)) {
                    re90.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re90.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re90.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP1.hit(1, 9)) {
                    re91.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re91.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re91.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP1.hit(2, 9)) {
                    re92.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re92.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re92.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP1.hit(3, 9)) {
                    re93.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re93.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re93.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP1.hit(4, 9)) {
                    re94.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re94.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re94.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP1.hit(5, 9)) {
                    re95.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re95.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re95.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP1.hit(6, 9)) {
                    re96.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re96.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re96.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP1.hit(7, 9)) {
                    re97.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re97.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re97.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP1.hit(8, 9)) {
                    re98.setFill(Color.RED);
                    turnP1 = false;
                } else {
                    re98.setFill(Color.BLUE);
                    turnP1 = true;
                }
                re98.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP1.hit(9, 9)) {
                    re99.setFill(Color.RED);
                    turnP1 = false;
                } else {
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
                if (gameboardP2.hit(0, 0)) {
                    rp00.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp00.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp00.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 0)) {
                    rp01.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp01.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp01.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 0)) {
                    rp02.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp02.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp02.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 0)) {
                    rp03.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp03.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp03.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 0)) {
                    rp04.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp04.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp04.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 0)) {
                    rp05.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp05.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp05.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 0)) {
                    rp06.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp06.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp06.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 0)) {
                    rp07.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp07.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp07.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 0)) {
                    rp08.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp08.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp08.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 0)) {
                    rp09.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp09.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp09.setDisable(true);
            }
        }
        if (event.getSceneY() > 470 && event.getSceneY() <= 500) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 1)) {
                    rp10.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp10.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp10.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 1)) {
                    rp11.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp11.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp11.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 1)) {
                    rp12.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp12.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp12.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 1)) {
                    rp13.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp13.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp13.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 1)) {
                    rp14.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp14.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp14.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 1)) {
                    rp15.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp15.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp15.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 1)) {
                    rp16.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp16.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp16.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 1)) {
                    rp17.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp17.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp17.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 1)) {
                    rp18.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp18.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp18.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 1)) {
                    rp19.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp19.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp19.setDisable(true);
            }
        }
        if (event.getSceneY() > 500 && event.getSceneY() <= 530) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 2)) {
                    rp20.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp20.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp20.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 2)) {
                    rp21.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp21.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp21.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 2)) {
                    rp22.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp22.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp22.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 2)) {
                    rp23.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp23.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp23.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 2)) {
                    rp24.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp24.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp24.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 2)) {
                    rp25.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp25.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp25.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 2)) {
                    rp26.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp26.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp26.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 2)) {
                    rp27.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp27.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp27.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 2)) {
                    rp28.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp28.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp28.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 2)) {
                    rp29.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp29.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp29.setDisable(true);
            }
        }
        if (event.getSceneY() > 530 && event.getSceneY() <= 560) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 3)) {
                    rp30.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp30.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp30.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 3)) {
                    rp31.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp31.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp31.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 3)) {
                    rp32.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp32.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp32.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 3)) {
                    rp33.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp33.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp33.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 3)) {
                    rp34.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp34.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp34.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 3)) {
                    rp35.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp35.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp35.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 3)) {
                    rp36.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp36.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp36.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 3)) {
                    rp37.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp37.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp37.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 3)) {
                    rp38.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp38.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp38.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 3)) {
                    rp39.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp39.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp39.setDisable(true);
            }
        }
        if (event.getSceneY() > 560 && event.getSceneY() <= 590) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 4)) {
                    rp40.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp40.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp40.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 4)) {
                    rp41.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp41.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp41.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 4)) {
                    rp42.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp42.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp42.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 4)) {
                    rp43.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp43.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp43.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 4)) {
                    rp44.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp44.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp44.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 4)) {
                    rp45.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp45.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp45.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 4)) {
                    rp46.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp46.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp46.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 4)) {
                    rp47.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp47.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp47.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 4)) {
                    rp48.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp48.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp48.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 4)) {
                    rp49.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp49.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp49.setDisable(true);
            }
        }
        if (event.getSceneY() > 590 && event.getSceneY() <= 620) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 5)) {
                    rp50.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp50.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp50.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 5)) {
                    rp51.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp51.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp51.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 5)) {
                    rp52.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp52.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp52.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 5)) {
                    rp53.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp53.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp53.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 5)) {
                    rp54.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp54.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp54.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 5)) {
                    rp55.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp55.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp55.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 5)) {
                    rp56.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp56.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp56.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 5)) {
                    rp57.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp57.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp57.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 5)) {
                    rp58.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp58.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp58.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 5)) {
                    rp59.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp59.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp59.setDisable(true);
            }
        }
        if (event.getSceneY() > 620 && event.getSceneY() <= 650) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 6)) {
                    rp60.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp60.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp60.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 6)) {
                    rp61.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp61.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp61.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 6)) {
                    rp62.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp62.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp62.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 6)) {
                    rp63.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp63.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp63.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 6)) {
                    rp64.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp64.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp64.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 6)) {
                    rp65.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp65.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp65.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 6)) {
                    rp66.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp66.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp66.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 6)) {
                    rp67.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp67.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp67.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 6)) {
                    rp68.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp68.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp68.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 6)) {
                    rp69.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp69.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp69.setDisable(true);
            }
        }
        if (event.getSceneY() > 650 && event.getSceneY() <= 680) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 7)) {
                    rp70.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp70.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp70.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 7)) {
                    rp71.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp71.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp71.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 7)) {
                    rp72.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp72.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp72.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 7)) {
                    rp73.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp73.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp73.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 7)) {
                    rp74.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp74.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp74.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 7)) {
                    rp75.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp75.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp75.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 7)) {
                    rp76.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp76.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp76.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 7)) {
                    rp77.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp77.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp77.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 7)) {
                    rp78.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp78.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp78.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 7)) {
                    rp79.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp79.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp79.setDisable(true);
                turnP1 = true;
            }
        }
        if (event.getSceneY() > 680 && event.getSceneY() <= 710) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 8)) {
                    rp80.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp80.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp80.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 8)) {
                    rp81.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp81.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp81.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 8)) {
                    rp82.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp82.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp82.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 8)) {
                    rp83.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp83.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp83.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 8)) {
                    rp84.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp84.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp84.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 8)) {
                    rp85.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp85.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp85.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 8)) {
                    rp86.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp86.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp86.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 8)) {
                    rp87.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp87.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp87.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 8)) {
                    rp88.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp88.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp88.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 8)) {
                    rp89.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp89.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp89.setDisable(true);
            }
        }
        if (event.getSceneY() > 710 && event.getSceneY() <= 740) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (gameboardP2.hit(0, 9)) {
                    rp90.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp90.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp90.setDisable(true);
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (gameboardP2.hit(1, 9)) {
                    rp91.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp91.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp91.setDisable(true);
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (gameboardP2.hit(2, 9)) {
                    rp92.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp92.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp92.setDisable(true);
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (gameboardP2.hit(3, 9)) {
                    rp93.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp93.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp93.setDisable(true);
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (gameboardP2.hit(4, 9)) {
                    rp94.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp94.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp94.setDisable(true);
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (gameboardP2.hit(5, 9)) {
                    rp95.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp95.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp95.setDisable(true);
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (gameboardP2.hit(6, 9)) {
                    rp96.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp96.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp96.setDisable(true);
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (gameboardP2.hit(7, 9)) {
                    rp97.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp97.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp97.setDisable(true);
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (gameboardP2.hit(8, 9)) {
                    rp98.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp98.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp98.setDisable(true);
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (gameboardP2.hit(9, 9)) {
                    rp99.setFill(Color.RED);
                    turnP1 = true;
                } else {
                    rp99.setFill(Color.BLUE);
                    turnP1 = false;
                }
                rp99.setDisable(true);
            }
        }
    }

    public void shot(MouseEvent event) {
        if (hbx_pone1.isDisable()){
            shotP2(event);
            if (turnP1){
                disableP1Board();
                enableP2Board();
            }else{
                enableP1Board();
                disableP2Board();
                lbl_information.setText(pc.getName2() + " is now shooting!");
            }
        }else if (hbx_ptwo1.isDisable()){
            shotP1(event);
            if (!turnP1){
                enableP1Board();
                disableP2Board();
            }else{
                disableP1Board();
                enableP2Board();
                lbl_information.setText(pc.getName1() + " is now shooting!");
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
