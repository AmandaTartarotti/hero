import spock.lang.Specification
import net.jqwik.api.ForAll
import net.jqwik.api.Property

class PositionGroovyTest extends Specification {

    @Property
    void "test getLeft"(@ForAll int x, @ForAll int y) {
        given:
        def position = new Position(x, y)

        expect:
        position.getLeft().x == x - 1
        position.getLeft().y == y
    }

    @Property
    void "test getRight"(@ForAll int x, @ForAll int y) {
        given:
        def position = new Position(x, y)

        expect:
        position.getRight().x == x + 1
        position.getRight().y == y
    }

    @Property
    void "test getUp"(@ForAll int x, @ForAll int y) {
        given:
        def position = new Position(x, y)

        expect:
        position.getUp().x == x
        position.getUp().y == y - 1
    }

    @Property
    void "test getDown"(@ForAll int x, @ForAll int y) {
        given:
        def position = new Position(x, y)

        expect:
        position.getDown().x == x
        position.getDown().y == y + 1
    }
}
