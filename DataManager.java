/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: Clase que se encarga de cargar los datos de los pokemons desde un archivo CSV
 *  Fecha de creación: 09/03/2025
 *  Fecha de última modificación: 11/03/2025
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class DataManager {

    /**
     * Método que carga los datos de los pokemons desde un archivo CSV
     * @param filePath Ruta del archivo CSV
     * @param pokemonMap Mapa que contiene los pokemons
     * @return Mapa que contiene los pokemons
     */
    public static Map<String, Pokemon> loadPokemonData(String filePath, Map<String, Pokemon> pokemonMap) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {

                int firstQuote = line.indexOf("\"");
                int lastQuote = line.lastIndexOf("\"");

                String abilitiesString = "";
                String remainingData = line;

                if (firstQuote != -1 && lastQuote != -1) {
                    abilitiesString = line.substring(firstQuote + 1, lastQuote);
                    remainingData = line.substring(0, firstQuote) + line.substring(lastQuote + 1);
                }

                String[] data = remainingData.split(",");

                String name = data[0].trim();
                int pokedexNumber = Integer.parseInt(data[1].trim());
                String type1 = data[2].trim();
                String type2 = data[3].isEmpty() ? "N/A" : data[3].trim();
                String classification = data[4].trim();
                double height = Double.parseDouble(data[5].trim());
                double weight = Double.parseDouble(data[6].trim());
                List<String> abilities = Arrays.asList(abilitiesString.split(", "));
                int generation = Integer.parseInt(data[8].trim());
                String isLegendary = data[9].trim();

                Pokemon pokemon = new Pokemon(name, pokedexNumber, type1, type2, classification, height, weight, abilities, generation, isLegendary);
                pokemonMap.put(name, pokemon);
            }
        } 
        
        catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
        return pokemonMap;
    }
}