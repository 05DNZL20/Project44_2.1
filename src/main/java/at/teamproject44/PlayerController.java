package at.teamproject44;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.IOException;

public class PlayerController {
    @FXML
    Rectangle reX00, reX01, reX02, reX03, reX04, reX05, reX06, reX07, reX08, reX09,
            reX10, reX11, reX12, reX13, reX14, reX15, reX16, reX17, reX18, reX19,
            reX20, reX21, reX22, reX23, reX24, reX25, reX26, reX27, reX28, reX29,
            reX30, reX31, reX32, reX33, reX34, reX35, reX36, reX37, reX38, reX39,
            reX40, reX41, reX42, reX43, reX44, reX45, reX46, reX47, reX48, reX49,
            reX50, reX51, reX52, reX53, reX54, reX55, reX56, reX57, reX58, reX59,
            reX60, reX61, reX62, reX63, reX64, reX65, reX66, reX67, reX68, reX69,
            reX70, reX71, reX72, reX73, reX74, reX75, reX76, reX77, reX78, reX79,
            reX80, reX81, reX82, reX83, reX84, reX85, reX86, reX87, reX88, reX89,
            reX90, reX91, reX92, reX93, reX94, reX95, reX96, reX97, reX98, reX99,
            sixship, firstfourship, secondfourship, firstthreeship, secondthreeship, thirdthreeship, firsttwoship, secondtwoship, thirdtwoship, fourthtwoship;

    @FXML
    RadioButton rbt_vertical, rbt_horizontal;

    @FXML
    Button btn_finishp1, btn_finishp2, btn_save;

    @FXML
    TextField txt_name;

    Gameboard gameboard = null;

    Ship ship = null;

    int x, y;

    private void generateShip() {
        if (sixship.getFill() == Color.BLUE) {
            ship = new Ship(6, rbt_vertical.isSelected());
        } else if ((firstfourship.getFill() == Color.BLUE) || (secondfourship.getFill() == Color.BLUE)) {
            ship = new Ship(4, rbt_vertical.isSelected());
        } else if ((firstthreeship.getFill() == Color.BLUE) || (secondthreeship.getFill() == Color.BLUE) || (thirdthreeship.getFill() == Color.BLUE)) {
            ship = new Ship(3, rbt_vertical.isSelected());
        } else if ((firsttwoship.getFill() == Color.BLUE) || (secondtwoship.getFill() == Color.BLUE) || (thirdtwoship.getFill() == Color.BLUE) || (fourthtwoship.getFill() == Color.BLUE)) {
            ship = new Ship(2, rbt_vertical.isSelected());
        }
    }

    private int getShipLength() {
        int length = 0;
        if (sixship.getFill() == Color.BLUE) {
            length = 6;
        } else if ((firstfourship.getFill() == Color.BLUE) || (secondfourship.getFill() == Color.BLUE)) {
            length = 4;
        } else if ((firstthreeship.getFill() == Color.BLUE) || (secondthreeship.getFill() == Color.BLUE) || (thirdthreeship.getFill() == Color.BLUE)) {
            length = 3;
        } else if ((firsttwoship.getFill() == Color.BLUE) || (secondtwoship.getFill() == Color.BLUE) || (thirdtwoship.getFill() == Color.BLUE) || (fourthtwoship.getFill() == Color.BLUE)) {
            length = 2;
        }
        return length;
    }

    private void markShips(int nbr, String tmpString, String id) {
        for (int i = 0; i < getShipLength(); i++) {
            if (i != 0) {
                if (rbt_vertical.isSelected()) {
                    nbr = nbr + 10;
                } else {
                    nbr = nbr + 1;
                }
            }
            tmpString = id + "X" + String.format("%02d", nbr);

            if (tmpString.equals(reX00.getId())) {
                reX00.setFill(Color.WHITE);
                reX00.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX01.getId())) {
                reX01.setFill(Color.WHITE);
                reX01.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX02.getId())) {
                reX02.setFill(Color.WHITE);
                reX02.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX03.getId())) {
                reX03.setFill(Color.WHITE);
                reX03.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX04.getId())) {
                reX04.setFill(Color.WHITE);
                reX04.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX05.getId())) {
                reX05.setFill(Color.WHITE);
                reX05.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX06.getId())) {
                reX06.setFill(Color.WHITE);
                reX06.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX07.getId())) {
                reX07.setFill(Color.WHITE);
                reX07.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX08.getId())) {
                reX08.setFill(Color.WHITE);
                reX08.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX09.getId())) {
                reX09.setFill(Color.WHITE);
                reX09.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX10.getId())) {
                reX10.setFill(Color.WHITE);
                reX10.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX11.getId())) {
                reX11.setFill(Color.WHITE);
                reX11.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX12.getId())) {
                reX12.setFill(Color.WHITE);
                reX12.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX13.getId())) {
                reX13.setFill(Color.WHITE);
                reX13.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX14.getId())) {
                reX14.setFill(Color.WHITE);
                reX14.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX15.getId())) {
                reX15.setFill(Color.WHITE);
                reX15.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX16.getId())) {
                reX16.setFill(Color.WHITE);
                reX16.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX17.getId())) {
                reX17.setFill(Color.WHITE);
                reX17.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX18.getId())) {
                reX18.setFill(Color.WHITE);
                reX18.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX19.getId())) {
                reX19.setFill(Color.WHITE);
                reX19.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX20.getId())) {
                reX20.setFill(Color.WHITE);
                reX20.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX21.getId())) {
                reX21.setFill(Color.WHITE);
                reX21.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX22.getId())) {
                reX22.setFill(Color.WHITE);
                reX22.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX23.getId())) {
                reX23.setFill(Color.WHITE);
                reX23.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX24.getId())) {
                reX24.setFill(Color.WHITE);
                reX24.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX25.getId())) {
                reX25.setFill(Color.WHITE);
                reX25.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX26.getId())) {
                reX26.setFill(Color.WHITE);
                reX26.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX27.getId())) {
                reX27.setFill(Color.WHITE);
                reX27.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX28.getId())) {
                reX28.setFill(Color.WHITE);
                reX28.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX29.getId())) {
                reX29.setFill(Color.WHITE);
                reX29.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX30.getId())) {
                reX30.setFill(Color.WHITE);
                reX30.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX31.getId())) {
                reX31.setFill(Color.WHITE);
                reX31.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX32.getId())) {
                reX32.setFill(Color.WHITE);
                reX32.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX33.getId())) {
                reX33.setFill(Color.WHITE);
                reX33.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX34.getId())) {
                reX34.setFill(Color.WHITE);
                reX34.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX35.getId())) {
                reX35.setFill(Color.WHITE);
                reX35.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX36.getId())) {
                reX36.setFill(Color.WHITE);
                reX36.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX37.getId())) {
                reX37.setFill(Color.WHITE);
                reX37.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX38.getId())) {
                reX38.setFill(Color.WHITE);
                reX38.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX39.getId())) {
                reX39.setFill(Color.WHITE);
                reX39.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX40.getId())) {
                reX40.setFill(Color.WHITE);
                reX40.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX41.getId())) {
                reX41.setFill(Color.WHITE);
                reX41.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX42.getId())) {
                reX42.setFill(Color.WHITE);
                reX42.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX43.getId())) {
                reX43.setFill(Color.WHITE);
                reX43.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX44.getId())) {
                reX44.setFill(Color.WHITE);
                reX44.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX45.getId())) {
                reX45.setFill(Color.WHITE);
                reX45.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX46.getId())) {
                reX46.setFill(Color.WHITE);
                reX46.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX47.getId())) {
                reX47.setFill(Color.WHITE);
                reX47.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX48.getId())) {
                reX48.setFill(Color.WHITE);
                reX48.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX49.getId())) {
                reX49.setFill(Color.WHITE);
                reX49.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX50.getId())) {
                reX50.setFill(Color.WHITE);
                reX50.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX51.getId())) {
                reX51.setFill(Color.WHITE);
                reX51.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX52.getId())) {
                reX52.setFill(Color.WHITE);
                reX52.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX53.getId())) {
                reX53.setFill(Color.WHITE);
                reX53.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX54.getId())) {
                reX54.setFill(Color.WHITE);
                reX54.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX55.getId())) {
                reX55.setFill(Color.WHITE);
                reX55.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX56.getId())) {
                reX56.setFill(Color.WHITE);
                reX56.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX57.getId())) {
                reX57.setFill(Color.WHITE);
                reX57.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX58.getId())) {
                reX58.setFill(Color.WHITE);
                reX58.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX59.getId())) {
                reX59.setFill(Color.WHITE);
                reX59.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX60.getId())) {
                reX60.setFill(Color.WHITE);
                reX60.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX61.getId())) {
                reX61.setFill(Color.WHITE);
                reX61.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX62.getId())) {
                reX62.setFill(Color.WHITE);
                reX62.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX63.getId())) {
                reX63.setFill(Color.WHITE);
                reX63.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX64.getId())) {
                reX64.setFill(Color.WHITE);
                reX64.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX65.getId())) {
                reX65.setFill(Color.WHITE);
                reX65.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX66.getId())) {
                reX66.setFill(Color.WHITE);
                reX66.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX67.getId())) {
                reX67.setFill(Color.WHITE);
                reX67.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX68.getId())) {
                reX68.setFill(Color.WHITE);
                reX68.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX69.getId())) {
                reX69.setFill(Color.WHITE);
                reX69.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX70.getId())) {
                reX70.setFill(Color.WHITE);
                reX70.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX71.getId())) {
                reX71.setFill(Color.WHITE);
                reX71.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX72.getId())) {
                reX72.setFill(Color.WHITE);
                reX72.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX73.getId())) {
                reX73.setFill(Color.WHITE);
                reX73.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX74.getId())) {
                reX74.setFill(Color.WHITE);
                reX74.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX75.getId())) {
                reX75.setFill(Color.WHITE);
                reX75.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX76.getId())) {
                reX76.setFill(Color.WHITE);
                reX76.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX77.getId())) {
                reX77.setFill(Color.WHITE);
                reX77.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX78.getId())) {
                reX78.setFill(Color.WHITE);
                reX78.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX79.getId())) {
                reX79.setFill(Color.WHITE);
                reX79.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX80.getId())) {
                reX80.setFill(Color.WHITE);
                reX80.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX81.getId())) {
                reX81.setFill(Color.WHITE);
                reX81.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX82.getId())) {
                reX82.setFill(Color.WHITE);
                reX82.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX83.getId())) {
                reX83.setFill(Color.WHITE);
                reX83.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX84.getId())) {
                reX84.setFill(Color.WHITE);
                reX84.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX85.getId())) {
                reX85.setFill(Color.WHITE);
                reX85.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX86.getId())) {
                reX86.setFill(Color.WHITE);
                reX86.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX87.getId())) {
                reX87.setFill(Color.WHITE);
                reX87.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX88.getId())) {
                reX88.setFill(Color.WHITE);
                reX88.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX89.getId())) {
                reX89.setFill(Color.WHITE);
                reX89.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX90.getId())) {
                reX90.setFill(Color.WHITE);
                reX90.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX91.getId())) {
                reX91.setFill(Color.WHITE);
                reX91.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX92.getId())) {
                reX92.setFill(Color.WHITE);
                reX92.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX93.getId())) {
                reX93.setFill(Color.WHITE);
                reX93.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX94.getId())) {
                reX94.setFill(Color.WHITE);
                reX94.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX95.getId())) {
                reX95.setFill(Color.WHITE);
                reX95.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX96.getId())) {
                reX96.setFill(Color.WHITE);
                reX96.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX97.getId())) {
                reX97.setFill(Color.WHITE);
                reX97.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX98.getId())) {
                reX98.setFill(Color.WHITE);
                reX98.setStroke(Color.GREEN);
            } else if (tmpString.equals(reX99.getId())) {
                reX99.setFill(Color.WHITE);
                reX99.setStroke(Color.GREEN);
            }
        }
    }

    private void deletePlacedShip() {
        if (sixship.getFill() == Color.BLUE) {
            sixship.setVisible(false);
        } else if (firstfourship.getFill() == Color.BLUE) {
            firstfourship.setVisible(false);
        } else if (secondfourship.getFill() == Color.BLUE) {
            secondfourship.setVisible(false);
        } else if (firstthreeship.getFill() == Color.BLUE) {
            firstthreeship.setVisible(false);
        } else if (secondthreeship.getFill() == Color.BLUE) {
            secondthreeship.setVisible(false);
        } else if (thirdthreeship.getFill() == Color.BLUE) {
            thirdthreeship.setVisible(false);
        } else if (firsttwoship.getFill() == Color.BLUE) {
            firsttwoship.setVisible(false);
        } else if (secondtwoship.getFill() == Color.BLUE) {
            secondtwoship.setVisible(false);
        } else if (thirdtwoship.getFill() == Color.BLUE) {
            thirdtwoship.setVisible(false);
        } else if (fourthtwoship.getFill() == Color.BLUE) {
            fourthtwoship.setVisible(false);
        }
    }

    private void XandY(MouseEvent e) {
        if (e.getSceneY() > 100 && e.getSceneY() <= 140) {
            y = 0;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 140 && e.getSceneY() <= 180) {
            y = 1;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 180 && e.getSceneY() <= 220) {
            y = 2;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 220 && e.getSceneY() <= 260) {
            y = 3;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 260 && e.getSceneY() <= 300) {
            y = 4;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 300 && e.getSceneY() <= 340) {
            y = 5;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 340 && e.getSceneY() <= 380) {
            y = 6;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 380 && e.getSceneY() <= 420) {
            y = 7;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 420 && e.getSceneY() <= 460) {
            y = 8;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        } else if (e.getSceneY() > 460 && e.getSceneY() <= 500) {
            y = 9;
            if (e.getSceneX() > 140 && e.getSceneX() <= 180) {
                x = 0;
            } else if (e.getSceneX() > 180 && e.getSceneX() <= 220) {
                x = 1;
            } else if (e.getSceneX() > 220 && e.getSceneX() <= 260) {
                x = 2;
            } else if (e.getSceneX() > 260 && e.getSceneX() <= 300) {
                x = 3;
            } else if (e.getSceneX() > 300 && e.getSceneX() <= 340) {
                x = 4;
            } else if (e.getSceneX() > 340 && e.getSceneX() <= 380) {
                x = 5;
            } else if (e.getSceneX() > 380 && e.getSceneX() <= 420) {
                x = 6;
            } else if (e.getSceneX() > 420 && e.getSceneX() <= 460) {
                x = 7;
            } else if (e.getSceneX() > 460 && e.getSceneX() <= 500) {
                x = 8;
            } else if (e.getSceneX() > 500 && e.getSceneX() <= 5400) {
                x = 9;
            }
        }

    }

    public void click_save(ActionEvent e) {
        if (!txt_name.getText().isEmpty()) {
            gameboard = new Gameboard(new Player(txt_name.getText()));
            btn_save.setDisable(true);
            txt_name.setDisable(true);
        } else {
            gameboard = new Gameboard(new Player(txt_name.getAccessibleText()));
            btn_save.setDisable(true);
            txt_name.setDisable(true);
        }
    }

    public void placeShip(MouseEvent e) {
        generateShip();
        XandY(e);
        if (!rbt_horizontal.isDisabled() && !rbt_vertical.isDisabled()) {
            Rectangle rt = (Rectangle) e.getSource();
            String string = rt.getId();
            String tmpString = null;

            String[] strarr = string.split("X");
            String id = strarr[0];
            int nbr = Integer.parseInt(strarr[1]);

            if (gameboard.placeShipOnBoard(ship,x,y,rbt_vertical.isSelected())) {
                markShips(nbr, tmpString, id);


                deletePlacedShip();

                rbt_vertical.setDisable(true);
                rbt_horizontal.setDisable(true);

                sixship.setDisable(false);
                firstfourship.setDisable(false);
                secondfourship.setDisable(false);
                firstthreeship.setDisable(false);
                secondthreeship.setDisable(false);
                thirdthreeship.setDisable(false);
                firsttwoship.setDisable(false);
                secondtwoship.setDisable(false);
                thirdtwoship.setDisable(false);
                fourthtwoship.setDisable(false);
            }
            if (!sixship.isVisible() && !firstfourship.isVisible() && !secondfourship.isVisible() && !firstthreeship.isVisible() &&
                    !secondthreeship.isVisible() && !thirdthreeship.isVisible() && !firsttwoship.isVisible() && !secondtwoship.isVisible() &&
                    !thirdtwoship.isVisible() && !fourthtwoship.isVisible()) {
                if (btn_finishp1 != null) {
                    btn_finishp1.setDisable(false);
                }
                if (btn_finishp2 != null) {
                    btn_finishp2.setDisable(false);
                }
            }
        } else {
            return;
        }
    }

    public void click_finishp1(ActionEvent e) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PlayerTwo.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage();
        primaryStage.setTitle("Battleship-Player2-Board");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage thisStage = (Stage) btn_finishp1.getScene().getWindow();
        thisStage.close();
    }

    public void click_finishp2(ActionEvent e) {
        return;
    }

    public void selectShip(MouseEvent e) {
        if (btn_save.isDisabled()) {
            rbt_horizontal.setDisable(false);
            rbt_vertical.setDisable(false);

            Rectangle re = (Rectangle) e.getSource();
            if (re.getId().equals("sixship")) {
                sixship.setFill(Color.BLUE);
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0, 146, 0));
                secondthreeship.setFill(Color.rgb(0, 146, 0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("firstfourship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.BLUE);
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0, 146, 0));
                secondthreeship.setFill(Color.rgb(0, 146, 0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("secondfourship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.BLUE);
                firstthreeship.setFill(Color.rgb(0, 146, 0));
                secondthreeship.setFill(Color.rgb(0, 146, 0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("firstthreeship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.BLUE);
                secondthreeship.setFill(Color.rgb(0, 146, 0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("secondthreeship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0,146,0));
                secondthreeship.setFill(Color.BLUE);
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("thirdthreeship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0,146,0));
                secondthreeship.setFill(Color.rgb(0,146,0));
                thirdthreeship.setFill(Color.BLUE);
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("firsttwoship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0,146,0));
                secondthreeship.setFill(Color.rgb(0,146,0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.BLUE);
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("secondtwoship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0,146,0));
                secondthreeship.setFill(Color.rgb(0,146,0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.BLUE);
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                thirdtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("thirdtwoship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0,146,0));
                secondthreeship.setFill(Color.rgb(0,146,0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.BLUE);
                fourthtwoship.setFill(Color.rgb(0, 146, 0));
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                fourthtwoship.setDisable(true);
            } else if (re.getId().equals("fourthtwoship")) {
                sixship.setFill(Color.rgb(0, 146, 0));
                firstfourship.setFill(Color.rgb(0, 146, 0));
                secondfourship.setFill(Color.rgb(0, 146, 0));
                firstthreeship.setFill(Color.rgb(0,146,0));
                secondthreeship.setFill(Color.rgb(0,146,0));
                thirdthreeship.setFill(Color.rgb(0, 146, 0));
                firsttwoship.setFill(Color.rgb(0, 146, 0));
                secondtwoship.setFill(Color.rgb(0, 146, 0));
                thirdtwoship.setFill(Color.rgb(0, 146, 0));
                fourthtwoship.setFill(Color.BLUE);
                sixship.setDisable(true);
                firstfourship.setDisable(true);
                secondfourship.setDisable(true);
                firstthreeship.setDisable(true);
                secondthreeship.setDisable(true);
                thirdthreeship.setDisable(true);
                firsttwoship.setDisable(true);
                secondtwoship.setDisable(true);
                thirdtwoship.setDisable(true);
            }
        }
    }
}
