
/* 
 *  |public boolean remove(Object o)|ɾ��ָ��Ԫ�أ�����ɾ���Ƿ�ɹ�|
    |public E remove(int index)|ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��|
    |public E set(int index, E element)|�޸�ָ����������Ԫ�أ����ر��޸ĵ�Ԫ��|
    |public E get(int index)|����ָ����������Ԫ��|
    |public int size()|���ؼ����е�Ԫ�صĸ���|
 */
import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        // ��ָ��Ԫ��׷�ӵ��˼��ϵ�ĩβ
        array.add("123"); // �˷����᷵��һ��Booleanֵ
        array.add("43252"); // �˷����᷵��һ��Booleanֵ
        array.add("53425"); // �˷����᷵��һ��Booleanֵ
        // ��ӵ�ָ��λ��
        array.add(1, "java"); // ע�����ʱ index��Χֻ���ǳ��ȷ�Χ�ڣ�����ᷢ�����
        System.out.println(array);

        // ɾ��ָ��Ԫ�أ�����ɾ���Ƿ�ɹ�
        array.remove("123");
        System.out.println(array);
        // ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ��
        array.remove(1);
        System.out.println(array);
        // �޸�ָ����������Ԫ��
        array.set(0, "gao");
        // ��ȡָ����������Ԫ��
        array.get(0);
        System.out.println(array);
        // ���ؼ����е�Ԫ�صĸ���
        System.out.println(array.size());

    }
}