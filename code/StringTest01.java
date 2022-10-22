import java.util.Scanner;

/* 
 * 用户登录
 *      需求：已知用户名密码，请用程序实现模拟用户登录，三次机会，登陆后，给出相应提示
 * 
 *      思路：
 *          1. 已知用户名和密码，定义两个字符串
 *          2. 键盘录入用户名密码
 *          3. 拿键盘录入的用户名、密码和已知的用户名比较，给出相应提示。
 *          4. 用循环实现多次机会，用for循环
 */


public class StringTest01 {
    public static void main(String[] args) {
        // 定义两个常量
        String username = "gao";
        String userpasswd = "123456";
        // 定义一个用户输入对象
        Scanner user_input = new Scanner(System.in);

        // 利用for循环验证用户输入
        for(int i = 0;i<3;i++){

            System.out.println("请输入用户名：");
            String user = user_input.nextLine();
            System.out.println("请输入密码：");
            String passwd = user_input.nextLine();
    
            if(username.equals(user) && userpasswd.equals(passwd)){
                System.out.println("登录成功");
                break;
                
            }else{
                if(i == 2){
                    System.out.println("登录失败，你没有机会了");
                    break;
                }else{
                    System.out.println("登录失败，你还有"+ (2-i) +"次机会");
                }
            }


        }
        
        user_input.close();
    }
}
