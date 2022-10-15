// import java.util.Arrays;

/* 
* 反转
*/

public class Test09 {
    public static void main(String[] args) {
       int arr[] = {19, 28, 37, 46, 50};
    //    int temp = 0;

    //    for (int i=0;i<(arr.length/2);i++){
    //         temp = arr[i];                 
    //         arr[i] = arr[arr.length - i - 1];
    //         arr[arr.length - i -1] = temp; 
        reverse(arr);
    }
    public static void reverse(int[] arr){
        // start在增加 ,end在减少， 条件为 start <= end
        for(int start=0, end=arr.length-1; start <=end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        printArr(arr);
    }
    public static void printArr(int[] arr){
        System.out.print("[");
        
        for(int i=0;i<arr.length;i++){
            if(i == arr.length-1){
                System.out.println(arr[i]+"]");
            }else{
                System.out.print(arr[i]+",");
            }
        }
    }    
}
