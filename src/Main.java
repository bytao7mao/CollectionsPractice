import Collections.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        float floatVar = 2.0f;
        int intVar = 10;
        String stringVar = "bla";
        String fs;
        fs = String.format("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s", floatVar, intVar, stringVar);
        System.out.println(fs);

        Item2 it2 = new Item2();
        it2.getStr("a", "b");
        Castigator cond1 = (x) -> x > 5;
        Castigator cond2 = x -> x > 5;
        Castigator cond3 = (int x) -> x > 5;
        Castigator cond4 = x -> {return x > 5;};
        System.out.println(cond2.conditie(7));
        int x = 10;
        Vertebrate fishy = new Fish("diadora", 7);
        fishy.setCovering("piele de croco");
        System.out.println(fishy.skinType);
        System.out.println(fishy.covering());
        System.out.println("fishy is alive ? " + fishy.born());
        Vertebrate dog = new Fish();
        System.out.println(dog.getName());
        System.out.println(fishy.getName() + " aand he breaths like :" + fishy.breath());

        Product door = new Product("Wooden Door", 35);
        Product window = new Product("Glass Window", 10);
        Product floorPanel = new Product("Floor Panel", 25);

        Collection<Product> products = new ArrayList<>();
        products.add(new Product("Steel", 2));
        products.add(door);
        products.add(window);
        products.add(floorPanel);

        final Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()) {
            Product p = productIterator.next();
            if (p.getWeight() > 20){
                //System.out.println(p);
            } else {
                productIterator.remove();
            }
        }
        System.out.println(products);
        System.out.println(products.size() + " " + products.isEmpty() + " " + products.contains(window));

//        for (Product p : products) {
//            System.out.println(p);
//        }


    }
}
