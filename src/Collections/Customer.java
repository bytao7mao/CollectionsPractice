package Collections;

/**
 * Created by taoLen on 4/30/2018.
 */
public class Customer extends Object{
    String name;
    String[] population;
    int currentPopulation;

    public Customer(String name, int size) {
        this.name = name;
        population = new String[size];
        currentPopulation = 0;
    }
    public void hasPopulation(Customer n){
        population[currentPopulation++] = n.name;
    }


    public Customer() {}

}
