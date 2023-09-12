package Pokemontype;

interface GrassType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof FireType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof WaterType;
    }
}
