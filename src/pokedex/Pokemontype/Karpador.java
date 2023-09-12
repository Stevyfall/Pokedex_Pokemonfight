package Pokemontype;

import Ninja.Ninja;

public class Karpador extends Pokemon implements WaterType {
    public Karpador(int hp, int attack) {
        super("Karpador", hp, attack);
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
