package moves.physical;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

public final class FuryAttack extends PhysicalMove {

    // Вероятность количества ударов:
    // 2 - 37.5%
    // 3 - 37.5%
    // 4 - 12.5%
    // 5 - 12.5%

    private int remainingHits;

    public FuryAttack() {
        super(Type.NORMAL, 15, 0.85);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        // Если серия атак началась, то точность не проверяем
        if (remainingHits > 0) {
            remainingHits--;
            return true;
        }

        // Начало серии
        double roll = Math.random();

        if (roll < 0.375) {
            hits = 2;
        } else if (roll < 0.75) {
            hits = 3;
        } else if (roll < 0.875) {
            hits = 4;
        } else {
            hits = 5;
        }

        // В случае промаха, серия не начинается
        if (!super.checkAccuracy(att, def)) {
            hits = 1;
            return false;
        }

        // В случае попадания, мы начинаем бить
        remainingHits = hits - 1;
        return true;
    }

    @Override
    protected String describe() {
        return "использует Fury Attack";
    }
}
