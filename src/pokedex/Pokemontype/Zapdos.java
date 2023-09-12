package Pokemontype;

import Ninja.Ninja;

public class Zapdos extends Pokemon implements FlyingType,Electricype{
    public Zapdos(int hp, int attack) {
        super("Glurak", hp, attack);
    }

    @Override
    public boolean isWeakAgainst(Pokemon other) {
        // Only weakness of FireType, because the FlyingType weakness (grass) is cancelled out by Fire-Type.
        return !Electricype.super.isWeakAgainst(other);
        // Or:
        // return other instanceof WaterType;
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return Electricype.super.isStrongAgainst(other) || FlyingType.super.isStrongAgainst(other);
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
