package moves.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

public class Crabhammer extends PhysicalMove {
    
    // Имеет повышенный шанс крита (1/8 вместо 1/24)

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
        return "Использует Crabhammer";
    }
}

