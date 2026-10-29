package moves.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;

public final class Scratch extends PhysicalMove {

    // Просто урон

    public Scratch() {
        super(Type.NORMAL, 40, 1.0);
    }

    @Override
    protected String describe() {
        return "использует Scratch";
    }
}
