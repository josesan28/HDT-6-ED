/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: Clase que contiene los métodos para manejar los pokemons
 *  Fecha de creación: 09/03/2025
 *  Fecha de última modificación: 11/03/2025
 */

import java.util.*;

public class PokemonManager {

    private Map<String, Pokemon> pokemonMap;
    private LinkedHashMap<String, Pokemon> userCollection;

    /**
     * Constructor de la clase PokemonManager
     * @param pokemonMap Mapa que contiene los pokemons
     */
    public PokemonManager(Map<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
        this.userCollection = new LinkedHashMap<>();
    }

    /**
     * Método que añade un pokemon a la colección del usuario
     * @param pokemonName Nombre del pokemon a añadir
     */
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

    /**
     * Método que muestra los datos de un pokemon
     * @param pokemonName Nombre del pokemon a mostrar
     */
    public void showPokemonData(String pokemonName) {
        Pokemon pokemon = pokemonMap.get(pokemonName);
        if (pokemon == null) {
            System.out.println("El pokemon no existe");
        } 
        else {
            System.out.println(pokemon.toString());
        }
    }

    /**
     * Método que muestra el nombre y tipo 1 de los pokemons en la colección del usuario
     */
    public void showNameAndType1InUserCollection() {
        List<Pokemon> pokemonList = new ArrayList<>(userCollection.values());
        if (pokemonList.isEmpty()) {
            System.out.println("No tienes pokemons en tu colección");
        } 
        else {
            pokemonList.sort(Comparator.comparing(pokemon -> pokemon.type1));
            for (Pokemon pokemon : pokemonList) {
                System.out.println("Nombre: " + pokemon.name + " Tipo 1: " + pokemon.type1);
            }
        }
    }

    /**
     * Método que muestra el nombre y tipo 1 de todos los pokemons
     */
    public void showAllNameAndType1() {
        List<Pokemon> pokemonList = new ArrayList<>(pokemonMap.values());
        pokemonList.sort(Comparator.comparing(pokemon -> pokemon.type1));
        for (Pokemon pokemon : pokemonList) {
            System.out.println("Nombre: " + pokemon.name + " Tipo 1: " + pokemon.type1);
        }
    }

    /**
     * Método que muestra los nombres de los pokemons que tienen una habilidad específica
     * @param ability Habilidad a buscar
     * @return Nombres de los pokemons que tienen la habilidad
     */
    public String showNamesByAbility(String ability) {
        List<String> pokemonNames = new ArrayList<>();
        for (Pokemon pokemon : pokemonMap.values()) {
            if (pokemon.abilities.contains(ability)) {
                pokemonNames.add(pokemon.name);
            }
        }

        if (pokemonNames.isEmpty()) {
            return "No se encontraron pokemons con esa habilidad";
        } 
        else {
            return "Pokemons con la habilidad " + ability + ": " + pokemonNames;
        }
    }  
    
    /**
     * Método que devuelve la colección del usuario
     * @return Colección del usuario
     */
    public LinkedHashMap<String, Pokemon> getUserCollection() {
        return userCollection;
    }
}