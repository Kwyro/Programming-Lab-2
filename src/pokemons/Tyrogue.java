package pokemons;

import moves.physical.Lick;
import moves.special.BlastBurn;
import moves.status.Disable;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon {

    public Tyrogue(String name, int level) {
        super(name, level);

        setType(Type.FIGHTING);
        setStats(35, 35, 35, 35, 35, 35);
        setMove(new BlastBurn(), new Lick(), new Disable());
    }
}
