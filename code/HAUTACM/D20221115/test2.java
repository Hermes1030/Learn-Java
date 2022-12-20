package HAUTACM.d20221115;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int c = in.nextInt();
        int[] t = new int[c];

        for (int i = 0; i < c; i++) {
            String a = in.next();

            if (a.compareToIgnoreCase("haut") != 0) {
                t[i] = -1;
            } else {
                t[i] = 1;
            }
        }
        for (int i = 0; i < t.length; i++) {
            if (t[i] == -1) {
                System.out.println("No");
            } else {
                System.out.println("YeS");
            }
        }
    }
}