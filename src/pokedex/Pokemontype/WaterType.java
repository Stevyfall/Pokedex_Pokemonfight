package Pokemontype;



interface WaterType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof GrassType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof FireType;
    }
}

