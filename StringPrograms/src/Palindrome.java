public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        int i = 0;
        while (i <= str.length() / 2) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            i++;

            if (start != end) {
                return false;
            }
        }
        return true;

    }
}