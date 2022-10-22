/* 存储学生对象并遍历
	需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
	思路：
	1. 定义学生类
	2. 创建集合对象
	3. 创建学生对象
	4. 添加学生对象到集合中
	5. 遍历集合，采用通用遍历格式实现 */

import java.util.ArrayList;

public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        // Student s1 = new Student("gao", 20);
        // Student s2 = new Student("zhi", 22);
        // Student s3 = new Student("qiang", 23);

        // array.add(s1);
        // array.add(s2);
        // array.add(s3);

        
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i).getName() +":"+ array.get(i).getAge());
        }


    }
}
