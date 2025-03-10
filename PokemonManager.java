import java.util.*;

public class PokemonManager {

    private Map<String, Pokemon> pokemonMap;
    private LinkedHashMap<String, Pokemon> userCollection;

    public PokemonManager(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
        this.userCollection = new LinkedHashMap<>();
    }

    public void addPokemonToUserCollection(String pokemonName) {
        if (pokemonMap.containsKey(pokemonName)) {
            if (userCollection.containsKey(pokemonName)) {
                System.out.println("Este pokemon ya está en la colección");
            } 
            else {
                userCollection.put(pokemonName, pokemonMap.get(pokemonName));
                System.out.println("Pokemon añadido a tu colección");
            }
        }
        else {
            System.out.println("El pokemon no existe");
        }     
    }

    public void showPokemonData(String pokemonName) {
        Pokemon pokemon = pokemonMap.get(pokemonName);
        if (pokemon == null) {
            System.out.println("El pokemon no existe");
        } 
        else {
            pokemon.toString();
        }
    }

    public void showNameAndType1InUserCollection() {
        List<Pokemon> pokemonList = new ArrayList<>(userCollection.values());
        pokemonList.sort(Comparator.comparing(pokemon -> pokemon.type1));
        for (Pokemon pokemon : pokemonList) {
            System.out.println("Nombre: " + pokemon.name + " Tipo 1: " + pokemon.type1);
        }
    }

    public void showAllNameAndType1() {
        List<Pokemon> pokemonList = new ArrayList<>(pokemonMap.values());
        pokemonList.sort(Comparator.comparing(pokemon -> pokemon.type1));
        for (Pokemon pokemon : pokemonList) {
            System.out.println("Nombre: " + pokemon.name + " Tipo 1: " + pokemon.type1);
        }
    }

    public String showNameByAbility(String ability) {
        for (Pokemon pokemon : pokemonMap.values()) {
            if (pokemon.abilities.contains(ability)) {
                return pokemon.name;
            }
        }
        return "No se encontró ningún pokemon con esa habilidad";
    }   
}