package Viewer;

import Gui.GUI;
import ModelController.Arena;
import ModelController.Element;

import java.util.List;

public class arenaViewer extends Viewer<Arena>{
    public arenaViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new wallViewer());
        drawElements(gui, getModel().getMonsters(), new monsterViewer());
        drawElement(gui, getModel().getHero(), new heroViewer());
        //drawElement(gui, getModel().getCoin(), new coinViewer());
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, elementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, elementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
