
/* 
 *  |public boolean remove(Object o)|删除指定元素，返回删除是否成功|
    |public E remove(int index)|删除指定索引处的元素，返回被删除的元素|
    |public E set(int index, E element)|修改指定索引处的元素，返回被修改的元素|
    |public E get(int index)|返回指定索引处的元素|
    |public int size()|返回集合中的元素的个数|
 */
import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        // 将指定元素追加到此集合的末尾
        array.add("123"); // 此方法会返回一个Boolean值
        array.add("43252"); // 此方法会返回一个Boolean值
        array.add("53425"); // 此方法会返回一个Boolean值
        // 添加到指定位置
        array.add(1, "java"); // 注意添加时 index范围只能是长度范围内，否则会发生溢出
        System.out.println(array);

        // 删除指定元素，返回删除是否成功
        array.remove("123");
        System.out.println(array);
        // 删除指定索引处的元素，返回被删除的元素
        array.remove(1);
        System.out.println(array);
        // 修改指定索引处的元素
        array.set(0, "gao");
        // 获取指定索引处的元素
        array.get(0);
        System.out.println(array);
        // 返回集合中的元素的个数
        System.out.println(array.size());

    }
}