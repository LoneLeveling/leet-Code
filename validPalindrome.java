public class validPalindrome {
    public static void main(String[] args) {
        String str="amla";
        System.out.println(isPalindromeCheck(str));
    }

    public static boolean isPalindromeCheck(String s){
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        char[] arr = s.toCharArray();
        for (char ch:arr){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String finalOne= sb.toString();
        int left=0;
        int right =finalOne.length()-1;
        while (left<right){

            if(finalOne.charAt(left)!=finalOne.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
