package Collections;

/**
 * Created by taoLen on 4/28/2018.
 */
public class Product {
    private final String name;
    private final int weight;
    private int id = -1;

    public Product(){
        this.name = "default";
        this.weight = 10;
        this.id = -1;
    }
    public Product(String name, int weight, int id) {
        this.name = name;
        this.weight = weight;
        this.id = id;
    }
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {return name;}
    public int getWeight() {return weight;}
    public int getId(){return id;}

}
