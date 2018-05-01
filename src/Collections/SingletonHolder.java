package Collections;

/**
 * Created by taoLen on 4/30/2018.
 */
public class SingletonHolder {
    private SingletonHolder(){}
    private static final class SHolder{
        private static final SingletonHolder SINGLETON = new SingletonHolder();
    }
    public static SingletonHolder getInstance(){
        return SHolder.SINGLETON;
    }

}
