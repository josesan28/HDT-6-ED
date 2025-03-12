/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: Clase de pruebas unitarias para la clase PokemonManager
 *  Fecha de creación: 11/03/2025
 *  Fecha de última modificación: 11/03/2025
 */

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;


public class TestPokemonManager {
    
    /**
     * Prueba unitaria para el método addPokemonToUserCollection con HashMap
     */
    @Test
    public void testAddPokemonToUserCollectionWithHashMap() {
        Map<String, Pokemon> pokemonMap = new HashMap<>();
        List<String> abilities = new ArrayList<>();
        abilities.add("Static");
        abilities.add("Lightning-Rod");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric","N/A" , "Mouse Pokémon", 0.4, 6, abilities, 1, "No");
        pokemonMap.put("Pikachu", pikachu);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);

        pokemonManager.addPokemonToUserCollection("Pikachu");
        assertTrue(pokemonManager.getUserCollection().containsKey("Pikachu"));
    }

    /**
     * Prueba unitaria para el método addPokemonToUserCollection con TreeMap
     */
    @Test
    public void testAddPokemonToUserCollectionWithTreeMap() {
        Map<String, Pokemon> pokemonMap = new TreeMap<>();
        List<String> abilities = new ArrayList<>();
        abilities.add("Static");
        abilities.add("Lightning-Rod");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric","N/A" , "Mouse Pokémon", 0.4, 6, abilities, 1, "No");
        pokemonMap.put("Pikachu", pikachu);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);

        pokemonManager.addPokemonToUserCollection("Pikachu");
        assertTrue(pokemonManager.getUserCollection().containsKey("Pikachu"));
    }

    /**
     * Prueba unitaria para el método addPokemonToUserCollection con LinkedHashMap
     */
    @Test
    public void testAddPokemonToUserCollectionWithLinkedHashMap() {
        Map<String, Pokemon> pokemonMap = new LinkedHashMap<>();
        List<String> abilities = new ArrayList<>();
        abilities.add("Static");
        abilities.add("Lightning-Rod");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric","N/A" , "Mouse Pokémon", 0.4, 6, abilities, 1, "No");
        pokemonMap.put("Pikachu", pikachu);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);

        pokemonManager.addPokemonToUserCollection("Pikachu");
        assertTrue(pokemonManager.getUserCollection().containsKey("Pikachu"));
    }

    /**
     * Prueba unitaria para el método showNamesByAbility con HashMap
     */
    @Test
    public void testShowNamesByAbilityWithHashMap() {
        Map<String, Pokemon> pokemonMap = new HashMap<>();
        List<String> abilities = new ArrayList<>();
        abilities.add("Static");
        abilities.add("Lightning-Rod");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric","N/A" , "Mouse Pokémon", 0.4, 6, abilities, 1, "No");
        pokemonMap.put("Pikachu", pikachu);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);

        assertEquals("Pokemons con la habilidad Static: [Pikachu]", pokemonManager.showNamesByAbility("Static"));
        assertEquals("No se encontraron pokemons con esa habilidad", pokemonManager.showNamesByAbility("Overgrow"));
    }

    /**
     * Prueba unitaria para el método showNamesByAbility con TreeMap
     */
    @Test
    public void testShowNamesByAbilityWithTreeMap() {
        Map<String, Pokemon> pokemonMap = new TreeMap<>();
        List<String> abilities = new ArrayList<>();
        abilities.add("Static");
        abilities.add("Lightning-Rod");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric","N/A" , "Mouse Pokémon", 0.4, 6, abilities, 1, "No");
        pokemonMap.put("Pikachu", pikachu);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);

        assertEquals("Pokemons con la habilidad Static: [Pikachu]", pokemonManager.showNamesByAbility("Static"));
        assertEquals("No se encontraron pokemons con esa habilidad", pokemonManager.showNamesByAbility("Overgrow"));
    }

    /**
     * Prueba unitaria para el método showNamesByAbility con LinkedHashMap
     */
    @Test
    public void testShowNamesByAbilityWithLinkedHashMap() {
        Map<String, Pokemon> pokemonMap = new LinkedHashMap<>();
        List<String> abilities = new ArrayList<>();
        abilities.add("Static");
        abilities.add("Lightning-Rod");
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Electric","N/A" , "Mouse Pokémon", 0.4, 6, abilities, 1, "No");
        pokemonMap.put("Pikachu", pikachu);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);

        assertEquals("Pokemons con la habilidad Static: [Pikachu]", pokemonManager.showNamesByAbility("Static"));
        assertEquals("No se encontraron pokemons con esa habilidad", pokemonManager.showNamesByAbility("Overgrow"));
    }
}