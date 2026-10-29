package moves.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

public final class Crabhammer extends PhysicalMove {

    // Шанс критического удара — 1/8, множитель урона — 2.

    public Crabhammer() {
        super(Type.WATER, 100, 0.9);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 0.125) {
            return 2;
        }
        return 1;
    }

    @Override
    protected String describe() {
        return "использует Crabhammer";
    }
}
