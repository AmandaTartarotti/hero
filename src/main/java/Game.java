import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {

    private Screen screen; // atributo screen

    private Hero hero; // hero field

    public Game() {
        try {
            TerminalSize terminalSize = new TerminalSize(40, 20);
            DefaultTerminalFactory terminalFactory = new
                    DefaultTerminalFactory()
                    .setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();

            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need a cursor
            screen.startScreen(); // screens must be started
            screen.doResizeIfNecessary(); // resize screen if necessary

            hero = new Hero(10, 10);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void draw(){
        screen.clear();
        hero.draw(screen);
        try {
            screen.refresh();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void processKey(KeyStroke key) {
        System.out.println(key);
        switch (key.getKeyType()) {
            case ArrowUp:
                hero.moveUp();
                break;
            case ArrowDown:
                hero.moveDown();
                break;
            case ArrowLeft:
                hero.moveLeft();
                break;
            case ArrowRight:
                hero.moveRight();
                break;
        }
    }

    public void run() {
        while (true){
            this.draw();
            try {
                KeyStroke key = screen.readInput();
                this.processKey(key);

                if (key.getKeyType() == KeyType.Character && key.getCharacter() == ('q')){
                    screen.close();
                }

                if (key.getKeyType() == KeyType.EOF){
                    break;
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
