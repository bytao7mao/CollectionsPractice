package Collections;

/**
 * Created by taoLen on 4/30/2018.
 */
public class Customer extends Object{
    String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
        population++;
    }

    static int population; //A CLASS VARIABLE -
    // same memory location as the class

//    static void addPopulation(){
//        population++;
//    }



//    void counting(){
//        population++;
//    }
}
