package Collections;

import java.util.Objects;

/**
 * Created by taoLen on 4/30/2018.
 */
public class SingletonEx {
    private static SingletonEx SINGLETON;
    String name;
    int age;

    private SingletonEx(){}
    public static SingletonEx getSINGLETON(){
        if (SINGLETON == null){
            SINGLETON = new SingletonEx();
        }
        return SINGLETON;
    }

    public static void main(String[] args) {
        SingletonEx s1 = SingletonEx.getSINGLETON();
        s1.name = "tao";
        SingletonEx s2 = SingletonEx.getSINGLETON();
        System.out.println(s2.name);


    }
}

