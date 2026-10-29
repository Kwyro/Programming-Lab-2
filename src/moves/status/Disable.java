package moves.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Effect;

public final class Disable extends StatusMove {

    // Предыдущий ход, использованные противником блокируется на 1-8 ходов
    // Будем использовать упрощённую логику из-за условия, что нельзя изменять готовые классы и методы jar файла
    // Логика:
    // Будем вообще запрещать ему бить всеми атаками

    private Effect disabledEffect;

    public Disable() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (disabledEffect != null && disabledEffect.attack() == 0) {
            return;
        }
        double roll = Math.random();

        int turns;

        if (roll <= 0.125) {
            turns = 1;
        } else if (roll <= 0.25) {
            turns = 2;
        } else if (roll <= 0.375) {
            turns = 3;
        } else if (roll <= 0.5) {
            turns = 4;
        } else if (roll <= 0.625) {
            turns = 5;
        } else if (roll <= 0.75) {
            turns = 6;
        } else if (roll <= 0.875) {
            turns = 7;
        } else {
            turns = 8;
        }

        disabledEffect = new Effect().attack(0).turns(turns + 1);
        p.addEffect(disabledEffect);
    }

    @Override
    protected String describe() {
        return "использует Disable";
    }
}
