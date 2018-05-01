/**
 * Created by taoLen on 4/28/2018.
 */
public class TwoDimArrays {

    public static void main(String[] args) {
        String[][] a = new String[10][10];
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("|i=" + i + " j=" + j + "-- ");
            }
        }
    }
}
