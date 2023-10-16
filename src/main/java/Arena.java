import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

public class Arena {

    private Screen screen;
    // TextGraphics graphics = screen.newTextGraphics();
    private Hero hero = new Hero(10, 10);
    private Position position = new Position(10,10);

    private int width; // width
    private int height; // height;

    // Constructor
    public Arena(int width, int height) {
        this.height = height;
        this.width = width;
    }

    //Getters
    public int getWidth(){ return width;}
    public int getHeight(){ return height;}

    //Setters
    public void setWidth(){ this.width = width;}
    public void setHeight(){ this.height = height;}

    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getX(), position.getY()), "X");
    }

    public Position moveUp() { return new Position(position.getX(), position.getY() - 1);}
    public Position moveDown() { return new Position(position.getX(), position.getY() + 1);}
    public Position moveLeft() { return new Position(position.getX() - 1, position.getY());}
    public Position moveRight() { return new Position(position.getX() + 1, position.getY());}

    public void moveHero(Position position)
    {
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    public boolean canHeroMove(Position position)
    {
        return (position.getX() >= 0 && position.getX() < width) &&
                (position.getY() >= 0 && position.getY() < height);
    }

    void processKey(KeyStroke key) {
        System.out.println(key);
        switch (key.getKeyType()) {
            case ArrowUp:
                moveUp();
                System.out.println(position.getY());
                break;
            case ArrowDown:
                moveDown();
                break;
            case ArrowLeft:
                moveLeft();
                break;
            case ArrowRight:
                moveRight();
                break;
        }
    }
}

