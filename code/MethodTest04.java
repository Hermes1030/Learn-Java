public class MethodTest04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int getnumber = getMax(a, b);
        if (getnumber == 0) {
            System.out.println("This is same number.");
        } else {
            System.out.println(getnumber);
        }
    }

    public static int getMax(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}
