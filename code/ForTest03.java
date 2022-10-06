/* 
 * 求1~100的偶数和
 * 
 */
public class ForTest03 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<=100;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("1~100的偶数和是："+sum);
    }
}
