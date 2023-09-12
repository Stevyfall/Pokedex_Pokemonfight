package Pokemontype;

public interface PokemonType {
    boolean isWeakAgainst(Pokemon other);

    boolean isStrongAgainst(Pokemon other);
}
