package at.teamproject44;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class GameBoardController implements Initializable {
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

    public void shot(MouseEvent event) {
        if (event.getSceneY() > 90 && event.getSceneY() <= 120) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re00.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 0)) {
                        re00.setFill(Color.RED);
                    } else {
                        re00.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re01.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 0)) {
                        re01.setFill(Color.RED);
                    } else {
                        re01.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re02.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 0)) {
                        re02.setFill(Color.RED);
                    } else {
                        re02.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re03.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 0)) {
                        re03.setFill(Color.RED);
                    } else {
                        re03.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re04.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 0)) {
                        re04.setFill(Color.RED);
                    } else {
                        re04.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re05.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 0)) {
                        re05.setFill(Color.RED);
                    } else {
                        re05.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re06.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 0)) {
                        re06.setFill(Color.RED);
                    } else {
                        re06.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re07.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 0)) {
                        re07.setFill(Color.RED);
                    } else {
                        re07.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re08.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 0)) {
                        re08.setFill(Color.RED);
                    } else {
                        re08.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re09.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 0)) {
                        re09.setFill(Color.RED);
                    } else {
                        re09.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 120 && event.getSceneY() <= 150) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re10.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 1)) {
                        re10.setFill(Color.RED);
                    } else {
                        re10.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re11.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 1)) {
                        re11.setFill(Color.RED);
                    } else {
                        re11.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re12.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 1)) {
                        re12.setFill(Color.RED);
                    } else {
                        re12.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re13.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 1)) {
                        re13.setFill(Color.RED);
                    } else {
                        re13.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re14.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 1)) {
                        re14.setFill(Color.RED);
                    } else {
                        re14.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re15.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 1)) {
                        re15.setFill(Color.RED);
                    } else {
                        re15.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re16.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 1)) {
                        re16.setFill(Color.RED);
                    } else {
                        re16.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re17.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 1)) {
                        re17.setFill(Color.RED);
                    } else {
                        re17.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re18.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 1)) {
                        re18.setFill(Color.RED);
                    } else {
                        re18.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re19.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 1)) {
                        re19.setFill(Color.RED);
                    } else {
                        re19.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 150 && event.getSceneY() <= 180) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re20.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 2)) {
                        re20.setFill(Color.RED);
                    } else {
                        re20.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re21.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 2)) {
                        re21.setFill(Color.RED);
                    } else {
                        re21.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re22.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 2)) {
                        re22.setFill(Color.RED);
                    } else {
                        re22.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re23.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 2)) {
                        re23.setFill(Color.RED);
                    } else {
                        re23.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re24.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 2)) {
                        re24.setFill(Color.RED);
                    } else {
                        re24.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re25.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 2)) {
                        re25.setFill(Color.RED);
                    } else {
                        re25.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re26.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 2)) {
                        re26.setFill(Color.RED);
                    } else {
                        re26.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re27.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 2)) {
                        re27.setFill(Color.RED);
                    } else {
                        re27.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re28.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 2)) {
                        re28.setFill(Color.RED);
                    } else {
                        re28.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re29.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 2)) {
                        re29.setFill(Color.RED);
                    } else {
                        re29.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 180 && event.getSceneY() <= 210) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re30.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 3)) {
                        re30.setFill(Color.RED);
                    } else {
                        re30.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re31.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 3)) {
                        re31.setFill(Color.RED);
                    } else {
                        re31.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re32.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 3)) {
                        re32.setFill(Color.RED);
                    } else {
                        re32.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re33.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 3)) {
                        re33.setFill(Color.RED);
                    } else {
                        re33.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re34.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 3)) {
                        re34.setFill(Color.RED);
                    } else {
                        re34.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re35.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 3)) {
                        re35.setFill(Color.RED);
                    } else {
                        re35.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re36.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 3)) {
                        re36.setFill(Color.RED);
                    } else {
                        re36.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re37.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 3)) {
                        re37.setFill(Color.RED);
                    } else {
                        re37.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re38.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 3)) {
                        re38.setFill(Color.RED);
                    } else {
                        re38.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re39.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 3)) {
                        re39.setFill(Color.RED);
                    } else {
                        re39.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 210 && event.getSceneY() <= 240) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re40.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 4)) {
                        re40.setFill(Color.RED);
                    } else {
                        re40.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re41.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 4)) {
                        re41.setFill(Color.RED);
                    } else {
                        re41.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re42.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 4)) {
                        re42.setFill(Color.RED);
                    } else {
                        re42.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re43.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 4)) {
                        re43.setFill(Color.RED);
                    } else {
                        re43.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re44.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 4)) {
                        re44.setFill(Color.RED);
                    } else {
                        re44.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re45.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 4)) {
                        re45.setFill(Color.RED);
                    } else {
                        re45.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re46.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 4)) {
                        re46.setFill(Color.RED);
                    } else {
                        re46.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re47.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 4)) {
                        re47.setFill(Color.RED);
                    } else {
                        re47.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re48.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 4)) {
                        re48.setFill(Color.RED);
                    } else {
                        re48.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re49.getFill() != Color.RED){
                    if (gameboardP1.hit(9, 4)) {
                        re49.setFill(Color.RED);
                    } else {
                        re49.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 240 && event.getSceneY() <= 270) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re50.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 5)) {
                        re50.setFill(Color.RED);
                    } else {
                        re50.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re51.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 5)) {
                        re51.setFill(Color.RED);
                    } else {
                        re51.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re52.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 5)) {
                        re52.setFill(Color.RED);
                    } else {
                        re52.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re53.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 5)) {
                        re53.setFill(Color.RED);
                    } else {
                        re53.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re54.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 5)) {
                        re54.setFill(Color.RED);
                    } else {
                        re54.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re55.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 5)) {
                        re55.setFill(Color.RED);
                    } else {
                        re55.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re56.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 5)) {
                        re56.setFill(Color.RED);
                    } else {
                        re56.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re57.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 5)) {
                        re57.setFill(Color.RED);
                    } else {
                        re57.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re58.getFill() != Color.RED){
                    if (gameboardP1.hit(8, 5)) {
                        re58.setFill(Color.RED);
                    } else {
                        re58.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re59.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 5)) {
                        re59.setFill(Color.RED);
                    } else {
                        re59.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 270 && event.getSceneY() <= 300) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re60.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 6)) {
                        re60.setFill(Color.RED);
                    } else {
                        re60.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re61.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 6)) {
                        re61.setFill(Color.RED);
                    } else {
                        re61.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re62.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 6)) {
                        re62.setFill(Color.RED);
                    } else {
                        re62.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re63.getFill() != Color.RED){
                    if (gameboardP1.hit(3, 6)) {
                        re63.setFill(Color.RED);
                    } else {
                        re63.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re64.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 6)) {
                        re64.setFill(Color.RED);
                    } else {
                        re64.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re65.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 6)) {
                        re65.setFill(Color.RED);
                    } else {
                        re65.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re66.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 6)) {
                        re66.setFill(Color.RED);
                    } else {
                        re66.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re67.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 6)) {
                        re67.setFill(Color.RED);
                    } else {
                        re67.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re68.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 6)) {
                        re68.setFill(Color.RED);
                    } else {
                        re68.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re69.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 6)) {
                        re69.setFill(Color.RED);
                    } else {
                        re69.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 300 && event.getSceneY() <= 330) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re70.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 7)) {
                        re70.setFill(Color.RED);
                    } else {
                        re70.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re71.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 7)) {
                        re71.setFill(Color.RED);
                    } else {
                        re71.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re72.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 7)) {
                        re72.setFill(Color.RED);
                    } else {
                        re72.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re73.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 7)) {
                        re73.setFill(Color.RED);
                    } else {
                        re73.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re74.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 7)) {
                        re74.setFill(Color.RED);
                    } else {
                        re74.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re75.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 7)) {
                        re75.setFill(Color.RED);
                    } else {
                        re75.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re76.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 7)) {
                        re76.setFill(Color.RED);
                    } else {
                        re76.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re77.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 7)) {
                        re77.setFill(Color.RED);
                    } else {
                        re77.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re78.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 7)) {
                        re78.setFill(Color.RED);
                    } else {
                        re78.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re79.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 7)) {
                        re79.setFill(Color.RED);
                    } else {
                        re79.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 330 && event.getSceneY() <= 360) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re80.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 8)) {
                        re80.setFill(Color.RED);
                    } else {
                        re80.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re81.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 8)) {
                        re81.setFill(Color.RED);
                    } else {
                        re81.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re82.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 8)) {
                        re82.setFill(Color.RED);
                    } else {
                        re82.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re83.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 8)) {
                        re83.setFill(Color.RED);
                    } else {
                        re83.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re84.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 8)) {
                        re84.setFill(Color.RED);
                    } else {
                        re84.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re85.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 8)) {
                        re85.setFill(Color.RED);
                    } else {
                        re85.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re86.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 8)) {
                        re86.setFill(Color.RED);
                    } else {
                        re86.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re87.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 8)) {
                        re87.setFill(Color.RED);
                    } else {
                        re87.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re88.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 8)) {
                        re88.setFill(Color.RED);
                    } else {
                        re88.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re89.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 8)) {
                        re89.setFill(Color.RED);
                    } else {
                        re89.setFill(Color.BLUE);
                    }
                }
            }
        }
        if (event.getSceneY() > 360 && event.getSceneY() <= 430) {
            if (event.getSceneX() > 70 && event.getSceneX() <= 100) {
                if (re90.getFill() != Color.RED) {
                    if (gameboardP1.hit(0, 9)) {
                        re90.setFill(Color.RED);
                    } else {
                        re90.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 100 && event.getSceneX() <= 130) {
                if (re91.getFill() != Color.RED) {
                    if (gameboardP1.hit(1, 9)) {
                        re91.setFill(Color.RED);
                    } else {
                        re91.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 130 && event.getSceneX() <= 160) {
                if (re92.getFill() != Color.RED) {
                    if (gameboardP1.hit(2, 9)) {
                        re92.setFill(Color.RED);
                    } else {
                        re92.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 160 && event.getSceneX() <= 190) {
                if (re93.getFill() != Color.RED) {
                    if (gameboardP1.hit(3, 9)) {
                        re93.setFill(Color.RED);
                    } else {
                        re93.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 190 && event.getSceneX() <= 220) {
                if (re94.getFill() != Color.RED) {
                    if (gameboardP1.hit(4, 9)) {
                        re94.setFill(Color.RED);
                    } else {
                        re94.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 220 && event.getSceneX() <= 250) {
                if (re95.getFill() != Color.RED) {
                    if (gameboardP1.hit(5, 9)) {
                        re95.setFill(Color.RED);
                    } else {
                        re95.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 250 && event.getSceneX() <= 280) {
                if (re96.getFill() != Color.RED) {
                    if (gameboardP1.hit(6, 9)) {
                        re96.setFill(Color.RED);
                    } else {
                        re96.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 280 && event.getSceneX() <= 310) {
                if (re97.getFill() != Color.RED) {
                    if (gameboardP1.hit(7, 9)) {
                        re97.setFill(Color.RED);
                    } else {
                        re97.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 310 && event.getSceneX() <= 340) {
                if (re98.getFill() != Color.RED) {
                    if (gameboardP1.hit(8, 9)) {
                        re98.setFill(Color.RED);
                    } else {
                        re98.setFill(Color.BLUE);
                    }
                }
            } else if (event.getSceneX() > 340 && event.getSceneX() <= 410) {
                if (re99.getFill() != Color.RED) {
                    if (gameboardP1.hit(9, 9)) {
                        re99.setFill(Color.RED);
                    } else {
                        re99.setFill(Color.BLUE);
                    }
                }
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PlayerController pc = new PlayerController();
        gameboardP1 = pc.getPlayer1();
        gameboardP2 = pc.getPlayer2();
        System.out.println(gameboardP1.toString());
        System.out.println(gameboardP2.toString());
    }
}
