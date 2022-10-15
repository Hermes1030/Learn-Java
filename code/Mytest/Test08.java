import java.util.Scanner;

/* 
 * 查找
 * 
 * 
 */
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner user_input = new Scanner(System.in);
        System.out.println("请输入要查找的数据：");
        int rlem = user_input.nextInt();
        
        // int targe = -1;
        // for(int i=0;i<arr.length;i++){
        //     if ( arr[i] == rlem){
        //         targe = i;
        //         break;
        //     }
            
        // }
        System.out.println("在数组中的第" + GetArrelem(rlem, arr) + "位置");
        user_input.close();

    }
    public static int GetArrelem(int rlem, int[] arr){
        int targe = -1;
        for(int i=0;i<arr.length;i++){
            if ( arr[i] == rlem){
                targe = i;
                break;
            }
            
        }
        return targe;
    }
}
