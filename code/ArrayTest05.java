public class ArrayTest05 {
    public static void main(String[] args) {
        int[] arr = {152, 150, 163, 171, 128, 130, 81, 168};
        int  max = arr[0];

        for(int x =1;x<arr.length;x++){
            if(arr[x] >max){
                max = arr[x];
            }
        }
        System.out.println(max);
    }
}
