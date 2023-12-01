import Gui.GUI;
import ModelController.Hero;
import com.googlecode.lanterna.graphics.TextGraphics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class heroTest {

    private Hero hero;
    private GUI gui;


    @BeforeEach
    void setUp() {
        hero = new Hero(10, 10);
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawTest() {
        TextGraphics textGraphics = null;
        hero.draw(textGraphics);
        Mockito.verify(gui, Mockito.times(1));
    }
}
