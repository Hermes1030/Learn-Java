/* 
 * 水仙花数
 * 水仙花是一个三位数，个十百位的立方和等于原数
 * 
 * 在控制台输出所有水仙花数
 * 
 */
public class ForTest04 {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            // 获取i上每个位
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10 % 10;
            // 判断各个位的立方是否等于原数
            if(a*a*a + b*b*b + c*c*c == i){
                System.out.println(i+"是水仙花数");
            }
        }     
    }
}
