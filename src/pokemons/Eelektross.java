package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.physical.*;
import moves.status.*;
import moves.special.*;

public class Eelektross extends Pokemon {

    public Eelektross(String name, int level) {
        super(name, level);

        addType(Type.ELECTRIC);
        setStats(85, 115, 80, 105, 80, 50);

        setMove(new Tickle(), new Scratch(), new MagicalLeaf(), new Ingrain());
    }
}
