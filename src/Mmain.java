import Ninja.Ninja;

import Pokemontype.*;

import Fightable.Team;

public class Mmain {


    public static void main(String[] args) {

        typedPokemonFight();

        teamFightPokemon();

        teamFightNinja();

    }


    static void typedPokemonFight() {

        var g = new Glurak(123, 5);

        var s = new Bisasam(50, 3);

        if(g.isStrongAgainst(s))

            System.out.println("Glurak is strong against Schiggy");

        if(s.isStrongAgainst(g))

            System.out.println("Schiggy is strong against Glurak");


        g.fight(s);

    }


    static void teamFightPokemon() {

        var ash = new Team<Pokemon>();

        ash.addMember(new Bisasam(30, 8));

        ash.addMember(new Pikachu(25, 6));

        ash.addMember(new Glurak(80, 10));


        var gary = new Team<Pokemon>();

        gary.addMember(new Bisasam(40, 7));

        gary.addMember(new Habitak(50, 10));

        gary.addMember(new Karpador(10, 1));


        System.out.println(ash);

        System.out.println(gary);

        ash.fight(gary);

        System.out.println(ash);

        System.out.println(gary);

    }


    static void teamFightNinja() {

        var n1 = new Team<Ninja>();

        n1.addMember(new Ninja(100, 10));

        var n2 = new Team<Ninja>();

        n2.addMember(new Ninja(20, 30));

        n2.addMember(new Ninja(20, 30));

        n2.addMember(new Ninja(20, 30));


        n1.fight(n2);

        System.out.println(n1);

        System.out.println(n2);


        // Note: It would not possible to execute ash.fight(n1), because ash.fight() requires a parameter of

        // type Team<Pokemon> and n1 would be of type Team<Ninja>.

        // Compiler error:

        //      java: incompatible types: Team<Pokemon> cannot be converted to Team<Ninja>

    }

}
