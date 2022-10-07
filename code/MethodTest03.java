public class MethodTest03 {
    public static void main(String[] args) {
        
    // isEvenNumber(10);

    // System.out.printf("%s",isEvenNumber(20));

    boolean flag = isEvenNumber(30);
    System.out.println(flag);

    
    }
    public static boolean isEvenNumber(int number){
        if(number%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
