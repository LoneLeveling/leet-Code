import java.util.Scanner;

//Palindrome Number
//Given an integer x, return true if x is a
//        palindrome
//        , and false otherwise.
//
//        Example 1:
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.
//        Example 2:
//
//        Input: x = -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//        Example 3:
//
//        Input: x = 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//Constraints:
//        -231 <= x <= 231 - 1
public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //taking care of given constraints
        try {
            int n = sc.nextInt();
            System.out.println(isPalindrome(n));
        }catch (java.util.InputMismatchException r){
            System.out.println("Invalid Input! Enter integer input");
        }
    }
    public static boolean isPalindrome(int x) {

        int rev=0;
        int num1=x;
        if(x>=0){
            while(x!=0){
                int rem=x%10;
                rev=rev*10+rem;
                x=x/10;
            }
            if(rev==num1){
                return true;
            }else
                return false;
        }
        else
            return false;

    }

}
