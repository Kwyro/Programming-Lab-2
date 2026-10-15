package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.special.*;
import moves.physical.*;
import moves.status.*;

public class Tynamo extends Pokemon {

    public Tynamo(String name, int level) {
        super(name, level);

        setType(Type.ELECTRIC);
        setStats(35, 55, 40, 45, 40, 60);

        setMove(new Tickle(), new Scratch());
    }
}
