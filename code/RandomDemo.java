import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        // System.out.println(number);

        // 用for 输出10个随机数
        for (int i = 1; i <= 10; i++) {
            int number = r.nextInt(10);
            System.out.println(number);
        }
        // 输出一个[1, 100] 的随机数
        int x = r.nextInt(100) + 1;
        System.out.println(x);

    }
}
