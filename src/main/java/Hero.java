import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Hero {
    private Position position = new Position(10,10);
    private int x;
    private int y;

    public Hero(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setPosition(Position position){
        this.position = position;
    }
}
