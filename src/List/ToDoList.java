package List;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by taoLen on 5/7/2018.
 */
public class ToDoList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("Ford Mustang");
        myList.add("Chevrolet Camaro");
        myList.add("BMW");
        myList.add("Mercedes");
        String firstTask = myList.get(0);
        myList.remove(0);
        firstTask = myList.get(0);
        System.out.println(firstTask);


        //remove an item from the end of the List and add it to begining of the List
        String x = (myList.remove(myList.size()-1));
        myList.add(0, x);
        //method2
        myList.add(0, myList.remove(myList.size()-1));

    }
}
