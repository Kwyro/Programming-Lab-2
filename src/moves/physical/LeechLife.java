package moves.physical;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;

public class LeechLife extends PhysicalMove {

    // Бьёт и восстанавливает 50%
    // от нанесённого врагу урона

    public LeechLife() {
        super(Type.BUG, 80, 1);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int) (-damage * 0.5));
    }

    @Override
    protected String describe() {
        return "использовал Leech Life";
    }
    
}
