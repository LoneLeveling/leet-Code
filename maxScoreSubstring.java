import java.util.Scanner;

public class maxScoreSubstring {
    static int x1 = 0;
    static int y1 = 0;
    static int num=0;

    public static void main(String[] args) {
        String s = "aabbaaxybbaabb";
       int x=5;
       int y=4;
        System.out.println("Ans = "+maximumGain(s,x,y));
    }
    public static int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);

        //prioritizing operation based on x and y
        if (x > y) {
            char firstPriority = 'a';
            num = aThenbSearch(sb, firstPriority, x, y);
        } else { // y > x
            char secondPriority = 'b';
            num = bThenaSearch(sb, secondPriority, x, y);
        }
        return num;
    }

    public static int aThenbSearch(StringBuilder sb, char firstPriority, int x, int y) {
        for (int i = 0; i <= sb.length() - 2; i++) {
            if (sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                x1++;
                sb.delete(i, i + 2); // Remove "ab"

                return aThenbSearch(sb, firstPriority, x, y);
            }
        }
        for (int i = 0; i <= sb.length() - 2; i++) {
        if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                y1++;
                sb.delete(i, i + 2); // Remove "ba"
                return aThenbSearch(sb, firstPriority, x, y);
            }
        }
        int num = x * x1 + y * y1;
        return num;
    }

    public static int bThenaSearch(StringBuilder sb, char secondPriority, int x, int y) {

        for (int i = 0; i <= sb.length() - 2; i++) {
            if (sb.charAt(i) == 'b' && sb.charAt(i + 1) == 'a') {
                y1++;
                sb.delete(i, i + 2); // Remove "ba"
                return bThenaSearch(sb, secondPriority, x, y);
            }
        }
        for (int i = 0; i <= sb.length() - 2; i++) {
            if(sb.charAt(i) == 'a' && sb.charAt(i + 1) == 'b') {
                x1++;
                sb.delete(i, i + 2); // Remove "ab"
                return bThenaSearch(sb, secondPriority, x, y);
            }
        }

        int num = x * x1 + y * y1;
        return num;
    }
}

