/* 考试奖励
 * 需求：根据小明考试的成绩获取应得的奖励，并通过控制台输出
 * 奖励：100~95 山地自行车
 *       94~90  游乐场一次
 *       89~80  变形金刚一个
 *       80 分以下 胖揍一顿
 */

import java.util.Scanner;

public class IfTest02 {
    public static void main(String[] args) {
    // 小明的成绩根据键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入小明的成绩:");
    
        int score = sc.nextInt();
    

        if (score <=100 && score >=0){
            if (score >= 95){
                System.out.println("奖励山地自行车一辆");
            }else if(score <= 94 && score >= 90  ){
                System.out.println("奖励游乐园一次");
            }else if(score <= 89 && score >= 80){
                System.out.println("奖励变形金刚一个");
            }else {
                System.out.println("对小明胖揍一顿");
            }
        }else{
            System.out.println("请输入正确的分数");
        }
        sc.close();
    }
    
}