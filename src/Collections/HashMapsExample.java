package Collections;


import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by taoLen on 4/30/2018.
 */
public class HashMapsExample {
    public static void main(String[] args) {


        final HashMap<String, Integer> map = new HashMap<>();
        map.put("AaAa", 1);
        map.put("BBBB", 2);
        map.put("AaBB", 3);
        map.put("BBAa", 4);

        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);




        final Map<MutableString, String> brokenMap = new HashMap<>();
        final String value = "abc";
        final MutableString key = new MutableString(value);
        brokenMap.put(key, value);

        System.out.println(brokenMap.get(key));
        System.out.println(brokenMap);
        key.set("def");
        System.out.println(brokenMap.get(key));
        System.out.println(brokenMap);
    }
    private static class MutableString{
        private String value;
        public MutableString(final String value){set(value);}

        public String get(){return value;}
        public void set(final String value){this.value=value;
            Objects.requireNonNull(value);}
        public boolean equals(final Object o){
            if(this == o)
                return true;
            if (o==null || getClass() != o.getClass())
                return false;
            final MutableString that = (MutableString) o;
            return value.equals(that.value);
        }
        public int hashCode(){return value.hashCode();}

        @Override
        public String toString() {
            return "MutableString{" +
                    "value='" + value + '\'' +
                    '}';
        }
    }
}
