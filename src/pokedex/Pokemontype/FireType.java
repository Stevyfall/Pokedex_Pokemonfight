package Pokemontype;



interface FireType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof WaterType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof GrassType;
    }
}
