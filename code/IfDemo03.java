import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        System.out.println("开始");
        
        System.out.println("请输入一个星期数：");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        
        if(week == 1){
            System.out.println("星期一");
        }
        else if(week == 2){
            System.out.println("星期二");
        }
        else if(week == 3){
            System.out.println("星期三");
        }
        else if(week == 4){
            System.out.println("星期四");
        }
        else if(week == 5){
            System.out.println("星期无");
        }
        else if(week == 6){
            System.out.println("星期六");
        }
        else{
            System.out.println("星期日");
        }

        System.out.println("结束");
    
        sc.close();
    }
}
