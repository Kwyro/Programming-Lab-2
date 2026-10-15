package moves.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Scratch extends PhysicalMove {

    // Просто урон

    public Scratch() {
        super(Type.NORMAL, 40, 100);
    }
}
