public class StringBuilderDemo02 {
    public static void main(String[] args) {
        
        String s = new String("123");
        System.out.println("(String) s:" + s);
        
        // String -> SB
        StringBuilder sb = new StringBuilder(s);
        System.out.println("(StringBuilder) sb:" + sb);
        
        // SB -> s
        String s01 = sb.toString();
        System.out.println("(String) s01:" + s01); 

    }
}
