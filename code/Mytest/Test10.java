import java.util.Scanner;

/* 
 * ��ί���
 *         ����
 *              �ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ[0, 100]
 *              ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֵ�4����ί��ƽ��ֵ��ȡ����
 *         ˼·��
 *              1. ����һ�����飬�ö�̬��ʼ���������Ԫ�صĳ�ʼ��������Ϊ6
 *              2. ����¼ȡ��ί����
 *              3. ��ѭ��������ί����
 *              4. ���巽����
 *                  a. ��ȡ��߷�
 *                  b. ��ȡ��ͷ�
 *                  c. ��ȡ��������Ԫ�صĺ�
 *              5. ���ռ��������ȡƽ���֣����
 * 
 *  */

public class Test10 {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int arr[] = new int[6];

        for(int i=0;i<6;i++){
            arr[i] = user_input.nextInt();
        }
        int resolve = (GetSum(arr) - GetMax(arr) -GetLow(arr))/4; 
        System.out.println("��ѡ�ֵ����յ÷��ǣ�"+resolve);
        user_input.close();
    }
    public static int GetMax(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(max < arr[i+1]){
                max = arr[i+1];
            }
        }
        return max;
    }
    public static int GetLow(int[] arr){
        int low = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(low>arr[i+1]){
                low = arr[i+1];
            }
        }
        return low;
    }
    public static int GetSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
