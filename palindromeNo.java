//https://leetcode.com/problems/palindrome-number/
public class palindromeNo {
    public static void main(String[] args) {
        int num=19291;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if (x < 0) {
            return false;
        }
        int leftIndex = 0;
        int count = 0;
        int rightIndex = str.length() - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(leftIndex++) != str.charAt(rightIndex--)) {
                return false;
            }

        }
      /*  if (count == str.length()) {
            return true;
        } else
            return false;
    */
        return true;
    }
}
