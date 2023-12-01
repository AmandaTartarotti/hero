package Viewer;

import ModelController.Hero;
import Gui.GUI;


public class heroViewer implements elementViewer<Hero> {

    @Override
    public void draw(Hero hero, GUI gui) {
        gui.drawHero(hero.getPosition());
    }
}
