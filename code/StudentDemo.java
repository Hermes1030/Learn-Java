public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s的栈内存地址：" + s);
        s.name = "Msr Gao";
        
        // 调用私有成员变量
        s.setAge(50);
        s.getAge();
        System.out.println(s.getAge());
        
        
        s.study();
        s.doHomework();
        // System.out.println(s.name + s.age);

        // 多个对象
        Student s1 = new Student();
        System.out.println("s1的栈内存地址：" + s1);
        s1.name = "Msr Li";
        // s1.age = 51;

        s1.study();
        s1.doHomework();
        // System.out.println(s1.name + s1.age);

        // 多个对象指向同一对象
        System.out.println("s1.name初始值为："+s1.name);
        // System.out.println("s1.age初始值为："+s1.age);
        Student s2 = s1;
        s2.name = "现在是s2";
        // s2.age = 1001;

        System.out.println("s1.name变成:"+ s1.name);
        // System.out.println("s1.age变成:"+ s1.age);
        System.out.println("s2.name" + s2.name);
        // System.out.println("s2.age:"+ s2.age);
    }
}

/* 
 * 执行输出：

s的栈内存地址：Student@4517d9a3
Studing  
doing    
Msr Gao50
s1的栈内存地址：Student@372f7a8d
Studing
doing
Msr Li51

s1.name初始值为：Msr Li
s1.age初始值为：51
s1.name变成:现在是s2
s1.age变成:1001
s2.name现在是s2
s2.age:1001

*/