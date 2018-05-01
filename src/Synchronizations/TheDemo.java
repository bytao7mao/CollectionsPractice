package Synchronizations;

/**
 * Created by taoLen on 5/1/2018.
 */
public class TheDemo {
    public synchronized void test(String name) {
        for (int i = 0; i < 10; i++) {
            yesSync.print(name + " :: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                yesSync.print(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        TheDemo theDemo = new TheDemo();
        new TestThread("THREAD 1", theDemo);
        new TestThread("THREAD 2", theDemo);
        new TestThread("THREAD 3", theDemo);
    }
}
