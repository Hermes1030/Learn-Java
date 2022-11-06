
public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);

        change(number);

        // 调用change后 number 的值不发生改变

        System.out.println("调用chage方法后：" + number);

    }

    public static void change(int number) {
        number = 200;
    }
}
