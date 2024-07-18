public class longestCommonPrefix {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
//        String str = "lramakent";
//        String d = "ram";
//        System.out.println("jairam".indexOf(d))=3;

    }
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];//flower
        for (int i = 1; i < strs.length; i++) {
            // Compare the current prefix with each string in the array
            while (strs[i].indexOf(prefix) != 0 )  //"flight".indexOf("fl")//false
            {
                // Reduce the prefix by one character from the end
                prefix = prefix.substring(0, prefix.length() - 1); //flower.substring(0,2)= fl
                // If the prefix becomes empty, return an empty string
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}
