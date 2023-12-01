import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena(20, 10);
    }

    @Test
    void testMoveHero() {
        Position initialPosition = arena.hero.getPosition();
        Position newPosition = new Position(5, 5);
        assertTrue(arena.canHeroMove(newPosition));

        arena.moveHero(newPosition);
        assertEquals(newPosition, arena.hero.getPosition());
        assertNotEquals(initialPosition, arena.hero.getPosition());
    }

    @Test
    void testRetrieveCoins() {
        Coin coin = new Coin(arena.hero.getPosition().getX(), arena.hero.getPosition().getY());
        arena.coins.add(coin);
        assertTrue(arena.coins.contains(coin));
        arena.retrieveCoins();
        assertFalse(arena.coins.contains(coin));
    }


    //AQUI É UM MUTANTE
    @Test
    void testRetrieveCoinsMutationn() {
        Coin coin = new Coin(arena.hero.getPosition().getX(), arena.hero.getPosition().getY());
        arena.coins.add(coin);
        assertTrue(arena.coins.contains(coin));
        //arena.retrieveCoins();
        assertFalse(arena.coins.contains(coin));
    }
}








