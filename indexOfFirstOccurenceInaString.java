//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class indexOfFirstOccurenceInaString {
    public static void main(String[] args) {
        String haystack="geeksforgeeks";
        String needle="eeks";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
