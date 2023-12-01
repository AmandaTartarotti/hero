package Viewer;

import ModelController.Wall;
import Gui.GUI;

public class wallViewer implements elementViewer<Wall> {

    @Override
    public void draw(Wall wall, GUI gui) {
        gui.drawWall(wall.getPosition());
    }
}
