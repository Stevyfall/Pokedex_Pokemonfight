import Pokemontype.Pokemon;
import pokedex.Pokedex;
import Pokemontype.*;
public class Main {
    public static void main(String[] args) {
       Pokedex<Pokemon> P1 = new Pokedex<Pokemon>("P1");
        Pokedex<Pokemon> P2 = new Pokedex<Pokemon>("P2");
        P1.adde(new Pikachu(50,50));
        P2.adde(new Glurak(23,45));
        P1.adde(new Habitak(23,56));
        P2.adde(new Arktos(55,80));
        P1.adde(new Pikachu(50,50));

        System.out.println(P1);
        System.out.println(P2);
       // System.out.println();
        System.out.println("------SWAP-----");
        P1.swap("Pikachu", P2,"Glurack" );
        //System.out.println(P1);
        //System.out.println(P2);
        System.out.println();

    }
}
