package Pokemontype;

import Ninja.Ninja;

public class Arktos extends Pokemon implements FlyingType,IceType{
    public Arktos(int hp, int attack) {
        super("Glurak", hp, attack);
    }

    @Override
    public boolean isWeakAgainst(Pokemon other) {
        // Only weakness of FireType, because the FlyingType weakness (grass) is cancelled out by Fire-Type.
        return !IceType.super.isWeakAgainst(other);
        // Or:
        // return other instanceof WaterType;
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return IceType.super.isStrongAgainst(other) || FlyingType.super.isStrongAgainst(other);
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
