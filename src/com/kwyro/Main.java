package com.kwyro;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;

import pokemons.*;

public class Main {

    // https://pokemondb.net/pokedex/chatot
    // https://pokemondb.net/pokedex/tyrogue
    // https://pokemondb.net/pokedex/hitmonlee
    // https://pokemondb.net/pokedex/tynamo
    // https://pokemondb.net/pokedex/eelektrik
    // https://pokemondb.net/pokedex/eelektross
    
    // В задании было сказано, что для каждого покемона нужно поставить такой уровень,
    // чтобы он мог использовать изученную атаку.
    // 
    // Но некоторые атаки вообще не могут быть использованы,
    // поэтому условимся, что для таких атак минимальный уровень = 1

    public static void main(String[] args) {
        Battle battle = new Battle();

        // Уровни по поколению VII с учётом обычной цепочки эволюции

        battle.addAlly(new Eelektross("Спасите", 39)); // Эволюция Eelektrik
        battle.addAlly(new Tyrogue("Тигр", 1));
        battle.addAlly(new Tynamo("Тинамо", 1));

        battle.addFoe(new Hitmonlee("Хитмолния", 20)); // Эволюция Tyrogue
        battle.addFoe(new Eelektrik("Пуп", 39)); // Эволюция Tynamo
        battle.addFoe(new Chatot("Попугай", 17)); // Изучение Fury Attack.

        battle.go();
    }
}
