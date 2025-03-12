/**
 *  @author José Manuel Sanchez Hernández - 24092
 *  @version 1.0
 *  Descripción: Clase que contiene los datos de un pokemon
 *  Fecha de creación: 09/03/2025
 *  Fecha de última modificación: 11/03/2025
 */

import java.util.List;

public class Pokemon {
    String name;
    int pokedexNumber;
    String type1;
    String type2;
    String classification;
    double height;
    double weight;
    List<String> abilities;
    int generation;
    String isLegendary;

    /**
     * Constructor de la clase Pokemon
     * @param name Nombre del pokemon
     * @param pokedexNumber Número en la pokedex
     * @param type1 Tipo 1
     * @param type2 Tipo 2
     * @param classification Clasificación
     * @param height Altura
     * @param weight Peso
     * @param abilities Habilidades
     * @param generation Generación
     * @param isLegendary Es legendario
     */
    public Pokemon(String name, int pokedexNumber, String type1, String type2, String classification, double height, double weight, List<String> abilities, int generation, String isLegendary) {
        this.name = name;
        this.pokedexNumber = pokedexNumber;
        this.type1 = type1;
        this.type2 = type2;
        this.classification = classification;
        this.height = height;
        this.weight = weight;
        this.abilities = abilities;
        this.generation = generation;
        this.isLegendary = isLegendary;
    }

    /**
     * Método que devuelve el nombre del pokemon
     * @return Nombre del pokemon
     */
    public String getName() {
        return name;
    }

    /**
     * Método que devuelve la información del pokemon
     * @return Información del pokemon
     */
    @Override
    public String toString() {
        return "Nombre: " + name + "\nNúmero en la pokedex: " + pokedexNumber + "\nTipo 1: " + type1 + "\nTipo 2: " + type2 + "\nClasificación: " + classification + "\nAltura: " + height + "\nPeso: " + weight + "\nHabilidades: " + abilities + "\nGeneración: " + generation + "\nEs legendario: " + isLegendary;
    }
    
}
