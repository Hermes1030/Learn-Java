/* ���������
 * ����
 *      ����8844430���ף�������һ���㹻���ֽ�������0.1���ס�
 * ���ʣ�
 *      �۵����ٴο����۳����������ĸ߶ȣ�
 */
public class WhileTest {
    public static void main(String[] args) {
        int count = 0;
        double paper = 0.1;
        int zmlm = 8844430;

        while( paper<=zmlm ){
            paper *= 2;
            count++;
        }
        System.out.println("�۵�"+count+"�Σ�ֽ�ź����һ���ߡ�");
    }
}
