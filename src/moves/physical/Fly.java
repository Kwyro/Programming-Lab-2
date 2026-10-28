package moves.physical;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Fly extends PhysicalMove {

    private boolean flying = false;

    public Fly() {
        super(Type.FLYING, 90, 0.95);
    }

    // Pokemon.jar выбирает атаки случайно: удар происходит при следующем
    // выборе Fly. Уклонение заменяет недоступную в API неуязвимость.
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        if (!flying) {
            flying = true;
            att.addEffect(new Effect().stat(Stat.EVASION, 6).turns(1));
            return true;
        }

        flying = false;
        return super.checkAccuracy(att, def);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        if (!flying) {
            super.applyOppDamage(p, damage);
        }
    }

    @Override
    protected String describe() {
        return "Использует Fly";
    }
}
