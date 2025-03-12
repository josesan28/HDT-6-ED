/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: clase factory que permite elegir el map a utilizar en el programa
 *  Fecha de creación: 09/03/2025
 *  Fecha de última modificación: 11/03/2025
 */

import java.util.*;

public class MapFactory {

    /**
     * Método que crea un map de pokemons
     * @param option Opción elegida por el usuario
     * @return Map de pokemons
     */
    public static Map<String, Pokemon> createPokemonMap(int option) {

        switch (option) {
            case 1:
                return new HashMap<>();
            case 2:
                return new TreeMap<>();
            case 3:
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("Opción no válida");
        }
    }  
}