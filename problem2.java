import java.util.Scanner;

//Problem: ReverseInteger
//        Given a signed 32-bit integer x, return x with its digits reversed.
//        If reversing x causes the value to go outside the signed 32-bit integer
//        range [-231, 231 - 1], then return 0.
//        Assume the environment does not allow you to store 64-bit
//        integers (signed or unsigned).
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     try{
         int n=sc.nextInt();
         System.out.println(reverse(n));
     }
     catch(java.util.InputMismatchException e){
         System.out.println("Invalid Input! Please enter a valid Iteger");
        }

    }

    public static int reverse(int x) {
int rev=0;
while (x!=0){
    int digit =x%10;
if (rev>Integer.MAX_VALUE/10 || rev>Integer.MAX_VALUE/10 && digit>7){
    return 0;
}
if(rev<Integer.MIN_VALUE/10 || rev<Integer.MIN_VALUE/10 && digit<-8){
    return 0;
}
rev=rev*10+digit;
x=x/10;
}

        return rev;
    }
}
