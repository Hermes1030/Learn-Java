import java.util.Arrays;

public class ClassTest01{
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6};

        // int[] a=Arrays.copyOf(arr, 5);

        // int[] b=Arrays.copyOf(arr, 7);

        // System.out.println(Arrays.toString(a));

        // System.out.println(Arrays.toString(b));

        // int[] arr = { 2, 3, 1, 5, 4, 6};

        // Arrays.sort(arr);

        // System.out.println(Arrays.toString(arr));
    
        int[] arr = { 2, 3, 1, 5, 4, 6};

        Arrays.sort(arr);
            
        int index=Arrays.binarySearch(arr, 3);
            
        System.out.println(index);
    
    
    }
}