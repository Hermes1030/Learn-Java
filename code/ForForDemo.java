/* 
 * 要求：
 *      利用循环嵌套在控制台输出一个一天的时钟
 * 分钟和小时范围：
 *      分钟：0<= mintue < 60
 *      时钟：0<= hour < 24
 */
public class ForForDemo {
    public static void main(String[] args) {
        for(int hour=0;hour<24;hour++){
            for(int mintue=0;mintue<60;mintue++){
                System.out.println(hour+":"+mintue);
            }
        }
    }
}
