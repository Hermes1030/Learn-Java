public class ArgsTest02 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66,77};
        int max = getMax(arr);
        System.out.println(max);
    }
    public static int getMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
