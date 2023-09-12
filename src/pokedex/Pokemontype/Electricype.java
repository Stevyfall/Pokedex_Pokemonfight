package Pokemontype;

interface Electricype extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof GrassType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof WaterType;
    }

    /*default boolean isStrongAgainst(Pokemon other) {
        return other instanceof FlyingType;
    }*/
}
