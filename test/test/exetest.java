package test;


import java.util.ArrayList;
import java.util.Arrays;

public class exetest {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4};
//        int[] b = a;
//        b[2] = 0;
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

        ArrayList<String> a = new ArrayList<>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");

        a.add(1,"5");
        System.out.println(a.toString());


    }
}