package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.special.*;
import moves.physical.*;
import moves.status.*;

public class Hitmonlee extends Pokemon {

    public Hitmonlee(String name, int level) {
        super(name, level);

        setType(Type.FIGHTING);
        setStats(50, 120, 53, 35, 110, 87);

        setMove(new LeechLife(), new BlastBurn(), new Lick(), new Disable());
    }
}
