package Collections;

/**
 * Created by taoLen on 4/29/2018.
 */
public class OuterInner {
    int x;
    public class Inner{
        void method1(){
            OuterInner.this.x = 19; //we don't use super because this is an inner class
        }
    }

    public static class InnerSecond{}
}
