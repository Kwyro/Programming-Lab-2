package moves.status;

import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;

public class Disable extends StatusMove {

    // Предыдущий ход, использованные противником блокируется на 1-8 ходов
    
    public Disable() {
        super(Type.NORMAL, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // Помогите :(
    }

    @Override
    protected String describe() {
        return "использует Disable";
    }
}
