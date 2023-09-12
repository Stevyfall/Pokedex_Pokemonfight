package pokedex;
import Pokemontype.*;

import java.util.*;


public class Pokedex<T extends Nameable>  {
    String spieler;
 //   List<String> pokedex = new ArrayList<String>();
   HashMap <String , T  >Map = new HashMap<>();

   //Random rand = new Random();
   public Pokedex(String spieler){
      this.spieler = spieler;
   }

    public void adde(T nameable){
       // for(int i = 0; i < pokedex.size(); i++){
            if(Map.containsKey(nameable.hereName())){
               return;
            }
            Map.put(nameable.hereName(), nameable );

      // }

    }
     public  void swap(String name, Pokedex<T> other, String otherName){

        // if(Map.get(name) == null || other.Map.get(otherName) == null) return;
         var temp = Map.get(name);
         Map.remove(name);
         Map.put(otherName, other.Map.get(otherName));
         other.Map.remove(otherName);
         other.Map.put(name, temp);
         System.out.println(name + " --> " + other.spieler);
         System.out.println(otherName + " --> " + spieler );

     }
    Set<String> getUniqueObjectsOf(Pokedex<T> other){
       Set<String> returnSet = new HashSet<>();
       Set<String> pokemon = (Set<String>) other.Map;
        for(int i = 0; i< Map.size();i++) {
            if (!this.Map.equals(other.Map)){                      //falls sie an der Stele unterschiedlich sind
              // returnSet.add(other.Map.get(i)) ;                          //sollte eig. den Unterschied einprinten
            }
        }  return  returnSet;


    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.spieler + " Pokedex:");
        result.append(System.lineSeparator());
        for (var p : Map.values()) {
            result.append("* ");
            result.append(p.toString());
            result.append(System.lineSeparator());
        }
        return result.toString();
    }


}




