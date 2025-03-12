import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


public class TestPokemonManager {
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

    @Test
    public void testAddPokemonToUserCollectionWithTreeMap() {
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

    @Test
    public void testAddPokemonToUserCollectionWithLinkedHashMap() {
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

    @Test
    public void testShowNamesByAbilityWithTreeMap() {
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

    @Test
    public void testShowNamesByAbilityWithLinkedHashMap() {
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
}