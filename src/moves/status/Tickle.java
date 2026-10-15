package moves.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;

public class Tickle extends StatusMove {

    // Снижает атаку и защиту
    // противника на 1 ступень

    public Tickle() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.ATTACK, -1);
    }

    @Override
    protected String describe() {
        return "использовал Tickle";
    }
}
