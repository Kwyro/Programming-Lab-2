package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.physical.*;
import moves.special.*;
import moves.status.*;

public class Eelektrik extends Pokemon {

    public Eelektrik(String name, int level) {
        super(name, level);

        addType(Type.ELECTRIC);
        setStats(65, 85, 70, 75, 70, 40);

        setMove(new Tickle(), new Scratch(), new MagicalLeaf());
    }
}
