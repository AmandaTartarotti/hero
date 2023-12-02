import spock.lang.Specification
import spock.lang.Subject
import com.googlecode.lanterna.input.KeyStroke
import com.googlecode.lanterna.input.KeyType



class ArenaGroovyTest extends Specification {

    @Subject
    private Arena arena = new Arena(20, 10)

    def setup() {
        arena = new Arena(20, 10)
    }

    def "test move hero"() {
        given:
        def initialPosition = arena.hero.position
        def newPosition = new Position(5, 5)
        arena.canHeroMove(newPosition) >> true

        when:
        arena.moveHero(newPosition)

        then:
        arena.hero.position == newPosition
        arena.hero.position != initialPosition
    }

    def "test retrieve coins"() {
        given:
        def coin = new Coin(arena.hero.position.x, arena.hero.position.y)
        arena.coins << coin

        expect:
        arena.coins.contains(coin)

        when:
        arena.retrieveCoins()

        then:
        !arena.coins.contains(coin)
    }

    // AQUI É UM MUTANTE
    def "test retrieve coins mutation"() {
        given:
        def coin = new Coin(arena.hero.position.x, arena.hero.position.y)
        arena.coins << coin

        expect:
        arena.coins.contains(coin)

        //arena.retrieveCoins()

        then:
        !arena.coins.contains(coin)
    }

    def "test process key"() {
        given:
        def keyStroke = Mock(KeyStroke)
        keyStroke.getKeyType() >> KeyType.ArrowUp

        when:
        arena.processKey(keyStroke)

        then:
        1 * keyStroke.getKeyType()
    }
}


