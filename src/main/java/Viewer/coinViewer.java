package Viewer;
import ModelController.Coin;
import Gui.GUI;

public class coinViewer implements elementViewer<Coin>{
    @Override
    public void draw(Coin coin, GUI gui) {
        gui.drawCoin(coin.getPosition());
    }
}
