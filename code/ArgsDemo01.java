
public class ArgsDemo01 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("����change����ǰ��" + number);

        change(number);

        // ����change�� number ��ֵ�������ı�

        System.out.println("����chage������" + number);

    }

    public static void change(int number) {
        number = 200;
    }
}
