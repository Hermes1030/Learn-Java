import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        
        System.out.println("������һ����������");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        
        if(week == 1){
            System.out.println("����һ");
        }
        else if(week == 2){
            System.out.println("���ڶ�");
        }
        else if(week == 3){
            System.out.println("������");
        }
        else if(week == 4){
            System.out.println("������");
        }
        else if(week == 5){
            System.out.println("������");
        }
        else if(week == 6){
            System.out.println("������");
        }
        else{
            System.out.println("������");
        }

        System.out.println("����");
    
        sc.close();
    }
}
