
//Valid Parentheses
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//        Output: true
//        Example 2:
//
//        Input: s = "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: s = "(]"
//        Output: false
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//        s consists of parentheses only '()[]{}'.
//

import java.util.Scanner;
import java.util.Stack;

public class Problem4 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(isValid(str));
        }
        public static boolean isValid(String s) {
           Stack<Character> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);

                if(ch=='('||ch=='['||ch=='{')
                {
                    st.push(ch);
                }
                else if(st.size()==0){
                    return false;
                }
                else if(ch==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }
                    else
                        return false;
                }
                else if(ch==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }
                    else return false;
                }
                else if(ch=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else
                        return false;
                }

            }
            if(st.size()==0){
                return true;
            }
            else
                return false;
        }

}
