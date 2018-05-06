package Recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by taoLen on 5/6/2018.
 */
public class ScannerWithIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Whats up");
        list.add("Bye");

        Iterator<String> it = list.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());


    }

}
