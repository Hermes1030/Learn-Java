package TryCatch;

public class tryDemo01 {
    public static void main(String[] args) {
        System.out.println("1");
        method();
        System.out.println("0");
    }
    public static void method(){
        int[] a = {1, 2, 3};

        try{
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); //  Index 3 out of bounds for length 3
            System.out.println(e.toString());   //  java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            e.printStackTrace();
        }
    }
}
