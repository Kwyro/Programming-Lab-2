package moves.physical;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lick extends PhysicalMove {
    
    // Наносит дамаг и имеет 30% шанс на парализование
    
    public Lick() {
        super(Type.GHOST, 30, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 1) {
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует Lick";
    }
}
