import java.util.Scanner;

/* 
 * ����
 * 
 * 
 */
public class Test08 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner user_input = new Scanner(System.in);
        System.out.println("������Ҫ���ҵ����ݣ�");
        int rlem = user_input.nextInt();
        
        // int targe = -1;
        // for(int i=0;i<arr.length;i++){
        //     if ( arr[i] == rlem){
        //         targe = i;
        //         break;
        //     }
            
        // }
        System.out.println("�������еĵ�" + GetArrelem(rlem, arr) + "λ��");
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
