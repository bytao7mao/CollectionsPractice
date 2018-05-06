package Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by taoLen on 4/30/2018.
 */
public class CustomerProgram {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice", 2);
        Customer bob = new Customer("Bob", 0);
        alice.hasPopulation(bob);



        System.out.println("Alice code: " + alice.hashCode());
        System.out.println("Bob code: " + bob.hashCode());


        Map<Integer, String> map = new HashMap<>();


    }
}
