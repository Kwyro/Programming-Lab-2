package moves.special;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;

public class MagicalLeaf extends SpecialMove {

    // Наносит урон и игнорирует изменения точности и уклонения
    // TODO: Игнорируется Fly

    public MagicalLeaf() {
        super(Type.GRASS, 60, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует Magical Leaf";
    }
}
