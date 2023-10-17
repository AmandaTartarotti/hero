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
    Hero hero = new Hero(10, 10);
    Position position = new Position(10, 10);

    private int width; // width
    private int height; // height;

    // Constructor
    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
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
        graphics.putString(new TerminalPosition(hero.getPosition().getX(), hero.getPosition().getY()), "X");
    }

   

    public void moveHero(Position position)
    {
        if (canHeroMove(position)) {
            System.out.println("entrei");
            hero.setPosition(position);
        }
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
                moveHero(hero.moveUp());
                break;
            case ArrowDown:
                moveHero(hero.moveDown());
                break;
            case ArrowLeft:
                moveHero(hero.moveLeft());
                break;
            case ArrowRight:
                moveHero(hero.moveRight());
                break;
        }
    }
}

