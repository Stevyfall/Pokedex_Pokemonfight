package Pokemontype;

import Ninja.Ninja;

public class Bisasam extends Pokemon implements GrassType {
    public Bisasam(int hp, int attack) {
        super("Bisasam", hp, attack);
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
