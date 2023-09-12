package Pokemontype;

import Ninja.Ninja;

public class Habitak  extends Pokemon implements FlyingType {
    public Habitak(int hp, int attack) {
        super("Habitak", hp, attack);
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

