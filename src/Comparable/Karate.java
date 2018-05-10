package Comparable;

/**
 * Created by taoLen on 5/7/2018.
 */
public class Karate implements Comparable<Karate>{
    private static final String belts[] = {"white", "yellow", "orange", "blue", "purple", "red", "brown", "black"};
    private int belt;
    private String name;

    @Override
    public String toString() {
        return belts[belt] + " belt " + this.name;
    }

    public Karate(String name) {
        this.belt = 0;
        this.name = name;
    }

    public void promote(){
        if (belt < 8)
            belt++;
    }

    @Override
    public int compareTo(Karate o) {
        if (this.belt > o.belt)
            return 1;
        else if (this.belt < o.belt)
            return -1;
        return 0;
    }

    public static void main(String[] args) {
        Karate k1 = new Karate("Daniel");
        Karate k2 = new Karate("Dorian");

        for (int x = 0; x < 5; x++) k2.promote();
        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k1.compareTo(k2));
    }

}
