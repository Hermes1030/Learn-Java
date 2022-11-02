import java.util.ArrayList;
import java.util.Scanner;

import StudentAndTeacher.Student;

/* 

存储学生对象并遍历
	需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合学生的姓名和年龄来自于键盘录入
	思路：
	1. 定义学生类
	2. 创建集合对象
	3. 键盘录入学生对象需要的数据
	4. 创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
	5. 往集合中添加学生对象
	6. 遍历集合，采用通用遍历格式实现 
    
*/

public class ArrayListTest03 {
    public static void main(String[] args) {
        // // 键盘录入类
        // Scanner input = new Scanner(System.in);
        // // 创建学生类
        // System.out.println("请输入学生1的姓名：");
        // String name = input.nextLine();
        // System.out.println("请输入学生2的年龄：");
        // String age = input.nextLine();
        // Student s1 = new Student(name, age);

        // System.out.println("请输入学生2的姓名：");
        // String name2 = input.nextLine();
        // System.out.println("请输入学生2的年龄：");
        // String age2 = input.nextLine();
        // Student s2 = new Student(name2, age2);

        // System.out.println("请输入学生3的姓名：");
        // String name3 = input.nextLine();
        // System.out.println("请输入学生3的年龄：");
        // String age3 = input.nextLine();
        // Student s3 = new Student(name3, age3);

        ArrayList<Student> array = new ArrayList<>();
        // array.add(s1);
        // array.add(s2);
        // array.add(s3);

        for (int i = 3; i > 0; i--) {
            addArray(array);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + ":" + array.get(i).getAge());
        }

    }

    public static void addArray(ArrayList<Student> array) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = input.nextLine();
        System.out.println("请输入学生年龄：");
        String age = input.nextLine();

        // Student s = new Student(name, age);
        // array.add(s);

    }

}
