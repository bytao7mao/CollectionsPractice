package Collections;

import java.util.HashMap;
import java.util.Map;

import static Collections.Customer.population;

/**
 * Created by taoLen on 4/30/2018.
 */
public class CustomerProgram {
    public static void main(String[] args) {
        Customer alice = new Customer();
        Customer bob = new Customer();
        alice.name = "Alice";
        bob.name = "Bob";

//        alice.addPopulation();
//        bob.addPopulation();

        System.out.println("Alice code: " + alice.hashCode());
        System.out.println("Bob code: " + bob.hashCode());

        System.out.println(Customer.population);

        Map<Integer, String> map = new HashMap<>();


    }
}
