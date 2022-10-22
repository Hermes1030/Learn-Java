import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        // 键盘录入星期（12345...) 控制台输出对应的星期数（星期一、星期二、星期三...）
        Scanner week = new Scanner(System.in);
        System.out.print("请输入一个星期数：");
        int week_rec = week.nextInt();

        switch(week_rec){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("你输入的星期数有误");
                break;
        }

        week.close();
    }
}
