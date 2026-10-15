package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.special.*;
import moves.physical.*;
import moves.status.*;

public class Tyrogue extends Pokemon {

    public Tyrogue(String name, int level) {
        super(name, level);

        setType(Type.FIGHTING);
        setStats(35, 35, 35, 35, 35, 35);

        setMove(new BlastBurn(), new Lick(), new Disable());
    }
}
