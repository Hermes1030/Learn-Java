/* 
 * Ҫ��
 *      ����ѭ��Ƕ���ڿ���̨���һ��һ���ʱ��
 * ���Ӻ�Сʱ��Χ��
 *      ���ӣ�0<= mintue < 60
 *      ʱ�ӣ�0<= hour < 24
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
