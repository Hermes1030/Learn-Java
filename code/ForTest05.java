/* 
 * 统计水仙花数并输出个数
 */
public class ForTest05 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =100; i < 1000;i++){  // 水仙花数是一个三位数，所以i的初始值为100
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 10 / 10 % 10;

            if(a*a*a + b*b*b + c*c*c ==i){
                System.out.println(i);
                count++;
            }
        }
            System.out.println("一共有"+count+"个水仙花数");
        
    }
}
