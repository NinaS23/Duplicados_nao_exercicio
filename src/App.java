import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> pokemons = new ArrayList<>();

        pokemons.add("Ditto");
        pokemons.add("Snorlax");
        pokemons.add("Pichu");
        pokemons.add("Charizard");
        pokemons.add("Lucario");
        pokemons.add("Meowth");

        List<String> pokemonsDoAsh = new ArrayList<>();

        pokemonsDoAsh.add("Lucario");
        pokemonsDoAsh.add("Snorlax");
        pokemonsDoAsh.add("Charizard");
        pokemonsDoAsh.add("Krookodile");
        pokemonsDoAsh.add("Gengar");
        
        List<String> pokemonsIguais = new ArrayList<>();

        for(int i = 0; i < pokemons.size(); i++){
           if(pokemonsDoAsh.contains(pokemons.get(i))){
              pokemonsIguais.add(pokemons.get(i));
           }
        }
        
        System.out.println(pokemonsIguais);

    }

}
