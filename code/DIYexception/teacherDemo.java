package DIYexception;

import java.util.Scanner;

public class teacherDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        teacher t = new teacher();

        try {
            t.checkScore(s);
        } catch (scorexception e) {
            e.printStackTrace();
        }
    }
}
