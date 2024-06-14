public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static boolean linearSearch(int[] arr, int target, int start, int end){
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
}
