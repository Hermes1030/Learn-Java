package TryCatch;

public class tryDemo {
    public static void main(String[] args) {
        System.out.println("1");
        method();
        System.out.println("-1");

    }
    public static void method(){

        try{
            int[] a = {1, 2, 3};
            System.out.println(a[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }
}
