package pokemons;

import moves.physical.LeechLife;

public final class Hitmonlee extends Tyrogue {

    public Hitmonlee(String name, int level) {
        super(name, level);

        setStats(50, 120, 53, 35, 110, 87);
        addMove(new LeechLife());
    }
}
