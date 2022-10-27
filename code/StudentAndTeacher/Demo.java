package StudentAndTeacher;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setAge(22);
        t1.setName("gao");
        System.out.println(t1.getName()+":"+t1.getAge());
        t1.Teach();

        System.out.println("----------------");
        
        Teacher t2 = new Teacher("gao1", 25);
        System.out.println(t2.getName()+":"+t2.getAge());
        t2.Teach();
        
        System.out.println("----------------");
        
        Student s1 = new Student();
        s1.setName("zhi");
        s1.setAge(19);
        System.out.println(s1.getName()+":"+s1.getAge());
        s1.doHomework();

        System.out.println("-------------------");

        Student s2 = new Student("qiang", 18);
        System.out.println(s2.getName()+":"+s2.getAge());
        s2.doHomework();
    }
}
