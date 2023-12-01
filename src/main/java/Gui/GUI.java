package Gui;
import ModelController.Position;

import java.io.IOException;

public interface GUI {

    void drawHero(Position position);

    void drawWall(Position position);

    void drawMonster(Position position);

    void drawCoin(Position position);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}

    ACTION getNextAction() throws IOException;
}
