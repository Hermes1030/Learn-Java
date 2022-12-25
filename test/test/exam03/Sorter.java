package test.exam03;

import java.util.Arrays;

public class Sorter {
    public static void main(String[] args) {
        double[] arr={1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public void sort(double[] p){
        double temp;
        int len = p.length;
        for(int i=0;i<len/2;i++){
            temp = p[len - i - 1];
            p[len-i-1] = p[i];
            p[i] = temp;
        }
    }
}
