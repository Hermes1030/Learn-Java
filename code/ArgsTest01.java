/* 
 * �������
 *      ����Ҫ�����һ�����飬��һ��������ʾ�����磺[11, 22, 33, 44, 55]
 *      
 *      ˼·����ΪҪ����һ������ʾ�����������ʱʹ��System.out.print()
 *          1. ����һ�����飬�þ�̬�����������Ԫ�س�ʼ��
 *          2. ����һ�����������������ͨ�ø�ʽ��������б���
 *          3. ���µ��������޸ı�������
 *          4. ���ñ�������
 * 
 *  
 */


public class ArgsTest01 {
    public static void main(String[] args) {
        System.out.println("Begin");
        int[] arr = {11, 22, 33, 44, 55};
        
        
        printArry(arr);

        System.out.println("Over");
    }
    public static void printArry(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length;i++){
            if( i == arr.length -1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
            
        }
        System.out.print("]\n");
    }
}
