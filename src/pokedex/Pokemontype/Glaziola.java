package Pokemontype;

import Ninja.Ninja;

public class Glaziola extends Pokemon implements IceType{
    public Glaziola(int hp, int attack) {
        super("Glaziola", hp, attack);
    }


    @Override
    public String hereName() {
        return null;
    }

    @Override
    public boolean fight(Ninja other) {
        return false;
    }
}
