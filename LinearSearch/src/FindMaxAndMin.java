public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println("min: "+find_Min(arr));
        System.out.println("max: "+find_Max(arr));

    }

     static int find_Max(int[] arr) {
        int  max= arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    //find the minimum number
    static int find_Min(int[] arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }

        }
        return min;
    }
}
