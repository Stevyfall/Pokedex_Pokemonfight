package Pokemontype;



interface FlyingType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof GrassType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return false;
    }
}
