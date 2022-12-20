package HAUTACM.d20221115;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int k = 0;
        int i = 0;

        for (int c = 0; c < t; c++) {
            int n = in.nextInt();
            k = in.nextInt();
            i = n / k;
        }

    }
}
