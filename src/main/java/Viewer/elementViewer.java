package Viewer;
import Gui.GUI;
import ModelController.Element;

public interface elementViewer <T extends Element> {
    void draw(T element, GUI gui);
}
