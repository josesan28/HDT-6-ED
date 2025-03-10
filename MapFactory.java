import java.util.*;

public class MapFactory {
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