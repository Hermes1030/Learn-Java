import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        // ����¼�����ڣ�12345...) ����̨�����Ӧ��������������һ�����ڶ���������...��
        Scanner week = new Scanner(System.in);
        System.out.print("������һ����������");
        int week_rec = week.nextInt();

        switch(week_rec){
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            case 7:
                System.out.println("������");
                break;
            default:
                System.out.println("�����������������");
                break;
        }

        week.close();
    }
}
