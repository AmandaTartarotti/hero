package ModelController;

import com.googlecode.lanterna.graphics.TextGraphics;


public abstract class Element {
    private Position position;
    public Element(int x, int y){
        position = new Position(x,y);
    }
    public Position getPosition(){ return position; }
    public void setPosition(Position pos){this.position = pos;}
    public void draw(TextGraphics screen){}

    public Position moveUp() { return new Position(position.getX(), position.getY() - 1);}
    public Position moveDown() { return new Position(position.getX(), position.getY() + 1);}
    public Position moveLeft() { return new Position(position.getX() - 1, position.getY());}
    public Position moveRight() { return new Position(position.getX() + 1, position.getY());}

}
