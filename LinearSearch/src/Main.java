//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[]  arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target =19;
        int ans = linearSearch(arr, target);
        System.out.println("element is :"+ans);
        int index = linearSearch2(arr, target);
        System.out.println("index: "+index);
        boolean res = linearSearch3(arr, target);
        System.out.println("Element is there? : "+res);

    }
    public static int linearSearch(int[] arr, int target){
        for(int element: arr){
            if(element == target){
                return element;
            }
        }
            // return -1; sometimes element should be -1, so we take MAX_VALUE
            return Integer.MAX_VALUE;

    }

    // searchh in the array: return the index if item found
    static int linearSearch2(int[] arr, int target){
            for(int index=0; index<arr.length; index++){
                int element= arr[index];
                if(element==target){
                    return index;
                }
            }
            return -1;
    }

    // search the target and return true or false
    public static boolean linearSearch3(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // This line will execute if none of the statements above have executed
        //hence the target not found
        return false;
    }

}