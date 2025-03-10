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

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Nombre: " + name + "\nNúmero en la pokedex: " + pokedexNumber + "\nTipo 1: " + type1 + "\nTipo 2: " + type2 + "\nClasificación: " + classification + "\nAltura: " + height + "\nPeso: " + weight + "\nHabilidades: " + abilities + "\nGeneración: " + generation + "\nEs legendario: " + isLegendary;
    }
    
}
