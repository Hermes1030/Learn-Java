import java.util.ArrayList;

//      存储字符串并遍历
//      	需求：创建一个存储字符串的集合，存储3个字符串元素，使用程序实现现在控制台遍历该集合
//      	思路：
//      		1. 创建对象
//      		2. 往集合中添加字符串对象
//      		3. 遍历集合，首先要能够获取到集合中的每一个元素，这个通过get(int index)方法实现
//      		4. 遍历集合，获取长度
//      		5. 遍历集合的通用格式
//      		
//           ```java
//      		for(int i=0;i<集合对象.size();i++){
//      			集合对象.get(i)
//      		}
//      		```


public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        
        array.add("gao");
        array.add("zhi");
        array.add("qiang");
        array.add("Java");

        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }
    }   
}
