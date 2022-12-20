package Args;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        System.out.println(getsum(1,2,3,4,5,6,7,8,9,10));
        System.out.println(getsum(1,2,3,4,5,6));
        System.out.println(getsum(1,2,3,4));

        System.out.println(getsum1(4,10,20,30,40,50));
        System.out.println(getsum1(4,10,20,30,40));
        System.out.println(getsum1(4,10,20,30,89));
        System.out.println(getsum1(4,10,22));
    }
    public static int getsum(int... a){
        int sum = 0;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }
    public static int getsum1(int b,int... a){
        int sum = b;
        for(int i:a){
            sum+=i;
        }
        return sum;
    }

}
