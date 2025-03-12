/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: Clase principal del programa
 *  Fecha de creación: 11/03/2025
 *  Fecha de última modificación: 11/03/2025
 */

import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int mapOption;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n------Pokemon Manager------\n");
            System.out.println("1. HashMap");
            System.out.println("2. TreeMap");
            System.out.println("3. LinkedHashMap");
            System.out.print("\nElige el tipo de mapa que deseas utilizar: ");
            mapOption = scanner.nextInt();
            scanner.nextLine();
        } while (mapOption < 1 || mapOption > 3);

        Map<String, Pokemon> pokemonMap = MapFactory.createPokemonMap(mapOption);
        DataManager.loadPokemonData("pokemon_data.csv", pokemonMap);
        PokemonManager pokemonManager = new PokemonManager(pokemonMap);
        String option;

        do {
            System.out.println("\n------Menú------\n");
            System.out.println("1. Añadir pokemon a la colección");
            System.out.println("2. Mostrar datos de un pokemon");
            System.out.println("3. Mostrar nombre y tipo 1 de los pokemons en la colección");
            System.out.println("4. Mostrar nombre y tipo 1 de todos los pokemons");
            System.out.println("5. Mostrar nombre de un pokemon por habilidad");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.print("\nIngresa el nombre del pokemon: ");
                    String pokemonName = scanner.nextLine();
                    pokemonManager.addPokemonToUserCollection(pokemonName);
                    break;

                case "2":
                    System.out.print("\nIngresa el nombre del pokemon: ");
                    pokemonName = scanner.nextLine();
                    pokemonManager.showPokemonData(pokemonName);
                    break;

                case "3":
                    pokemonManager.showNameAndType1InUserCollection();
                    break;

                case "4":
                    pokemonManager.showAllNameAndType1();
                    break;

                case "5":
                    System.out.print("\nIngresa la habilidad: ");
                    String ability = scanner.nextLine();
                    System.out.println(pokemonManager.showNamesByAbility(ability));
                    break;

                case "6":
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        } while (!option.equals("6"));
        
    scanner.close();
    }   
}