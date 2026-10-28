package moves.physical;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Stat;

public final class LeechLife extends PhysicalMove {

    // Восстанавливает половину реально снятого у противника HP

    private double actualDamage;

    public LeechLife() {
        super(Type.BUG, 80, 1.0);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        double hpBefore = Math.max(0, p.getHP());
        super.applyOppDamage(p, damage);
        actualDamage = Math.min(hpBefore, hpBefore - p.getHP());
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        int missingHP = (int) Math.max(0, p.getStat(Stat.HP) - p.getHP());
        if (actualDamage > 0 && p.isAlive()) {
            int heal = Math.max(1, (int) Math.round(actualDamage / 2));
            p.setMod(Stat.HP, -Math.min(heal, missingHP));
        }
        actualDamage = 0;
    }

    @Override
    protected String describe() {
        return "использует Leech Life";
    }
}
