package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by taoLen on 4/28/2018.
 */
public class ViewsOverMaps {
    public static void main(String[] args){
        OuterInner.InnerSecond cl = new OuterInner.InnerSecond(); //innerSecond is static
        OuterInner inn = new OuterInner();
        OuterInner.Inner inn2 = inn.new Inner();

        final Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, new Product("car", 200));
        idToProduct.put(2, new Product("zar", 300));
        idToProduct.put(3, new Product("dar", 400));

        System.out.println(idToProduct);
        final Set<Integer> keys = idToProduct.keySet();
        System.out.println(keys);
        keys.remove(1);
        System.out.println(idToProduct);
        final Collection<Product> vals = idToProduct.values();
        System.out.println(vals);

        final Set<Map.Entry<Integer,Product>> entries = idToProduct.entrySet();
        for (Map.Entry<Integer, Product> entry:entries) {
            System.out.println(entry.getKey() + " - > " + entry.getValue());
        }
        System.out.println(idToProduct);


        final Product defaultProduct = new Product("whatever", 100, 1);

        Product result = idToProduct.getOrDefault(10, defaultProduct);
        System.out.println(result);
        System.out.println(idToProduct.get(2));

        //replacing
        Product replaceResult = idToProduct.replace(2, new Product( "Big Door", 30, 2));
        System.out.println(idToProduct.get(2));
        System.out.println(idToProduct.hashCode());

        idToProduct.replaceAll((id, oldProduct) ->
            new Product(oldProduct.getName(), oldProduct.getWeight() + 10, oldProduct.getId() ));
        System.out.println(idToProduct);


        //add to HashMap if does not find id, if it finds it will ignore it
        Product x = idToProduct.computeIfAbsent(10, (id) ->
                new Product("Custom", 102, 10));
        System.out.println(x);
        System.out.println(idToProduct);


        idToProduct.forEach((key, value) -> System.out.println(key + " -> " + value));
        HashMap<String, HashMap> selects = new HashMap<String, HashMap>();

//        for(Map.Entry<String, HashMap> entry : selects.entrySet()) {
//            String key = entry.getKey();
//            HashMap value = entry.getValue();
//
//            // do what you have to do here
//            // In your case, another loop.
//        }

    }
}
