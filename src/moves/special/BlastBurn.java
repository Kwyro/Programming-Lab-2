package moves.special;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class BlastBurn extends SpecialMove {

    // Бьёт и пропускает следующий ход:
    // Мы должны наносить 0 урона после этого удара
    // в течение этого и следующего ход

    public BlastBurn() {
        super(Type.FIRE, 150, 0.9); 
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().attack(0).turns(2));
    }

    @Override
    protected String describe() {
        return "использует Blast Burn";
    }
}
