public class IfDemo02 {
    public static void main(String[] args) {
        System.out.println("开始");

        // 定义两个变量
        int a = 10;
        int b = 20;

        // 要求判断a是否大于b，如果是，在控制台输出a>b，如果不是在控制台输出a<b
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("a<b");
        }

        System.out.println("结束");
    }
}
