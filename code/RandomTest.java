/* 
 * 猜数字
 * [1, 100]
 * 
 */

import java.util.Scanner;
import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Scanner inputed_user = new Scanner(System.in);
        

        Random Random_num = new Random();
        int becread_num = Random_num.nextInt(100)+1;
        
        while(true){

            System.out.println("请输入你要猜的数字：");
            int inputed_num = inputed_user.nextInt();
            
            if (inputed_num > becread_num){
                System.out.println("您猜的数大了。");
            }
            else if(inputed_num < becread_num){
                System.out.println("您猜的数小了。");
            }
            else{
                System.out.println("您猜对了。");
                break;
            }
        }
        
        inputed_user.close();
    }
}
