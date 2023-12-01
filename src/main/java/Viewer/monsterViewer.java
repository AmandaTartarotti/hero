package Viewer;
import Gui.GUI;
import ModelController.Monster;


public class monsterViewer implements elementViewer<Monster> {
    @Override
    public void draw(Monster monster, GUI gui) {
        gui.drawMonster(monster.getPosition());
    }
}
