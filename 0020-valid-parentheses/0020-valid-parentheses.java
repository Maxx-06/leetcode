class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '[') stack.push(c);
            else {

                if (stack.isEmpty()) return false;
                char top = stack.pop();

                if( c == ')' && top != '(' ) return false;
                if( c == '}' && top != '{' ) return false;
                if( c == ']' && top != '[' ) return false;
            }
        }

        return stack.isEmpty();
    }
}



// import java.util.Stack;

// class Solution {
//     public boolean isValid(String s) {

//         Stack<Character> stack = new Stack<>();

//         for (int i = 0; i < s.length(); i++) {

//             char ch = s.charAt(i);

//             // Opening brackets
//             if (ch == '(' || ch == '[' || ch == '{') {
//                 stack.push(ch);
//             }
//             // Closing brackets
//             else {

//                 // No opening bracket to match
//                 if (stack.isEmpty()) {
//                     return false;
//                 }

//                 char top = stack.pop();

//                 if (ch == ')' && top != '(') {
//                     return false;
//                 }

//                 if (ch == ']' && top != '[') {
//                     return false;
//                 }

//                 if (ch == '}' && top != '{') {
//                     return false;
//                 }
//             }
//         }

//         // If stack is empty, everything matched
//         return stack.isEmpty();
//     }
// }