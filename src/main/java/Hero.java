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

    public Position getPosition(){ return position; }

    public void setPosition(Position position){
        this.position = position;
    }

    public Position moveUp() { return new Position(position.getX(), position.getY() - 1);}
    public Position moveDown() { return new Position(position.getX(), position.getY() + 1);}
    public Position moveLeft() { return new Position(position.getX() - 1, position.getY());}
    public Position moveRight() { return new Position(position.getX() + 1, position.getY());}
}

