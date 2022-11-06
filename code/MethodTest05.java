public class MethodTest05 {
    public static void main(String[] args) {
        System.out.println(compar(10, 20));
        // ǿ���� byte ���͵���
        System.out.println(compar((byte) 20, (byte) 10));
        // ǿ���� short ���͵���
        System.out.println(compar((short) 20, (short) 10));
        // ǿ���� long ���͵���
        System.out.println(compar(10L, 10L));
    }

    // int
    public static boolean compar(int a, int b) {
        return a == b;
    }

    // byte
    public static boolean compar(Byte a, Byte b) {
        return a == b;
    }

    // short
    public static boolean compar(short a, short b) {
        return a == b;
    }

    // long
    public static boolean compar(long a, long b) {
        return a == b;
    }
}
