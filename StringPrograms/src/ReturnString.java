//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ReturnString {
    public static void main(String[] args) {
        String str = "Hello";
        char[] arr = str.toCharArray();

        int left,right;
        right = arr.length -1;
        for(left=0; left<right; left++, right--){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            System.out.print(ch);
        }
    }
}