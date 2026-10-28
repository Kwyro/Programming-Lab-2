package pokemons;

import moves.physical.Crabhammer;
import moves.physical.Fly;
import moves.physical.FuryAttack;
import moves.status.Disable;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Chatot extends Pokemon {

    public Chatot(String name, int level) {
        super(name, level);

        setType(Type.NORMAL, Type.FLYING);
        setStats(76, 65, 45, 92, 42, 91);
        setMove(new Fly(), new Crabhammer(), new FuryAttack(), new Disable());
    }
}
