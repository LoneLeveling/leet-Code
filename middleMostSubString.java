import java.util.Stack;

public class middleMostSubString {
    public static void main(String[] args) {
        String inputStr = "(ed(et(oc))el)";
        String str = reverseParentheses(inputStr);
        System.out.println(str);
    }

    public static String reverseParentheses(String s) {
StringBuilder sb=new StringBuilder(s);
       return reversedString(sb);
    }
    private static String reversedString(StringBuilder sb){
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(') {
                startIndex = i;
            } else if (sb.charAt(i) == ')')
            {
                endIndex = i;
                break;
            }
        }

        if(startIndex==-1 || endIndex==-1){
            return sb.toString();
        }

        reverseString(startIndex+1, endIndex-1, sb);
        sb.deleteCharAt(endIndex);
        sb.deleteCharAt(startIndex);
        return reversedString(sb);
    }
    private static void reverseString(int startIndex, int endIndex, StringBuilder sb)
    {
        while (startIndex < endIndex) {
            char tmp = sb.charAt(startIndex);
            sb.setCharAt(startIndex, sb.charAt(endIndex));
            sb.setCharAt(endIndex, tmp);//sb.chartAt(int,char)
            startIndex++;
            endIndex--;
        }
    }

}