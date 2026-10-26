package moves.status;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Effect;

public class Ingrain extends StatusMove {

    // Хилит 1/16 хп от изначального здоровья, пока покемон на поле
    
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
        int heal = Math.max(1, (int) (p.getStat(Stat.HP) / 16));
        if (!activated) {
            p.addEffect(new Effect()
                    .stat(Stat.HP, -heal )
                    .turns(-1));

            activated = true;
        }
    }

    @Override
    protected String describe() {
        return "использует Ingrain";
    }
}
