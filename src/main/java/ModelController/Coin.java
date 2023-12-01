package ModelController;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Coin extends Element {
    private int width;
    private int height;

    public Coin(int width, int height){
        super(width, height);
    }

    @Override
    public void draw(TextGraphics graphics){
        graphics.setForegroundColor(TextColor.Factory.fromString("#a52a2a"));
        graphics.putString(new TerminalPosition(getPosition().getX(), getPosition().getY()), "o");
    }

    @Override
    public boolean equals(Object o){
        if(o == null || this.getClass() != o.getClass()) return false;

        return(this == o || this.getPosition().equals(((Coin) o).getPosition()));
    }

}
