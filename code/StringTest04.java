
// ƴ���ַ�����
// ���󣺶���һ����������int�����е����ݰ���ָ���ĸ�ʽƴ�ӳ�һ���ַ������أ����ø÷��������ڿ���̨��������磬����int[] arr={1, 2, 3};,ִ�з������������Ϊ��[1, 2, 3]
// ˼·��
// 1. ����һ��int���͵����飬�þ�̬��ʼ���������Ԫ�صĳ�ʼ��
// 2. ����һ�����������ڰ�int�����е����ݰ���ָ����ʽƴ�ӳ�һ���ַ������ء�����ֵ����String�������б�int[] arr
// 3. �ڷ����б������飬����Ҫ�����ƴ��
// 4. ���÷�������һ���������ܽ��
// 5. ������

public class StringTest04 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        String getArrtoString;
        getArrtoString = getToprint(arr);
        System.out.println(getArrtoString);
    }

    public static String getToprint(int[] arr) {
        String charC = "";
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            if (i == 0) {
                charC = "[" + elem + ", ";
            } else if (i == arr.length - 1) {
                charC += elem + "]";
            } else {
                charC += elem + ", ";
            }
        }
        return charC;
    }
}
