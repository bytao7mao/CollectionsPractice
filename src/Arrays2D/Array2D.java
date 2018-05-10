package Arrays2D;

import Collections.MyEnum;

import java.util.ArrayList;

/**
 * Created by taoLen on 5/6/2018.
 */
public class Array2D {
    static int count = 0;
    static int[][] myArr;




   // public static void main(String[] args) {
//        myArr = new int[2][2];
//        for (int i = 0; i < myArr.length; i++) {
//            for (int j = 0; j < myArr[i].length; j++) {
//                System.out.println("row :" + i + "\ncolumn :" + j);
//                myArr[i][j] = count;
//                count++;
//                System.out.println(count);
//            }
        public static void main(String[] args) {

            System.out.println(MyEnum.UNU);
            MyEnum.UNU.m1();
            final int x=8;
            int i=1;

            while(true){
                System.out.println(i++);
                break;
            }

            System.out.println(i+3);

            for(;i<=6;){
                System.out.println(i);
                i++;
            }

        }
        }
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Jessica");
//        names.add("Marius");
//        names.add(0, "Catalina");
//        String s = names.get(0);
//        System.out.println(names.toString());
//        int[] array = new int[10];
//        array[10] = 5;


    //}
//}
