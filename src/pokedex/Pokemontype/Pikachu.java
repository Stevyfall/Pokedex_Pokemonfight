package Pokemontype;


import Ninja.Ninja;
import Pokemontype.Electricype;

public class Pikachu extends Pokemon implements Electricype {
    public Pikachu(int hp, int attack) {
        super("Pikachu", hp, attack);
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


