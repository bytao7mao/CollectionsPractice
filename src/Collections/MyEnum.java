package Collections;

/**
 * Created by taoLen on 4/29/2018.
 */
public enum MyEnum {
    UNU {
        @Override
        public void m1() {
            System.out.println("one");
        }
    }, DOI {
        @Override
        public void m1() {
            System.out.println("two");
        }
    }, TREI {
        @Override
        public void m1() {
            System.out.println("three");
        }
    };

    public abstract void m1();
}
