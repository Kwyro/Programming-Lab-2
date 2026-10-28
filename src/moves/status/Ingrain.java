package moves.status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public final class Ingrain extends StatusMove {

    // Восстанавливает 1/16 максимального HP в конце каждого хода.
    // Ограничение Pokemon.jar: Effect хранит постоянную величину лечения,
    // а final-методы не позволяют ограничивать его недостающим HP каждый ход.
    
    private boolean activated = false;
    
    public Ingrain() {
        super(Type.GRASS, 0, 1.0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (activated) {
            return;
        }

        int heal = Math.max(1, (int) (p.getStat(Stat.HP) / 16));
        p.addEffect(new Effect()
                .stat(Stat.HP, -heal)
                .turns(-1));
        activated = true;
    }

    @Override
    protected String describe() {
        return "использует Ingrain";
    }
}
