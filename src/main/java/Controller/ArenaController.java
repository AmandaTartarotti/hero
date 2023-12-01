package Controller;

import Gui.GUI;
import ModelController.Arena;
import ModelController.Game;

import java.io.IOException;

public class ArenaController extends GameController{

    private HeroController heroController;
    private MonsterController monsterController;
    public ArenaController(Arena arena) {
        super(arena);
        this.heroController = new HeroController(arena);
        this.monsterController = new MonsterController(arena);
    }
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        heroController.step(game, action, time);
        monsterController.step(game, action, time);
    }
}
