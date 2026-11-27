class Solution {
    public String removeDuplicates(String s) {
        // Stack<Character> stack = new Stack<>();

        // for (char ch : s.toCharArray()) {
        //     if (stack.isEmpty() || ch != stack.peek()) {
        //         stack.push(ch);
        //     } else {
        //         stack.pop();
        //     }
        // }

        // StringBuilder result = new StringBuilder();

        // for (char ch : stack) {
        //     result.append(ch);
        // }

        // return result.toString();

        // 92 space 
        // 58 time

        // char[] stack = new char[s.length()];
        // int top = -1;

        // for (char ch : s.toCharArray()) {
        //     if (top == -1 || ch != stack[top]) {
        //         stack[++top] = ch;
        //     } else {
        //         top--;
        //     }
        // }

        // return new String(stack, 0, top + 1);



        char[] arr = s.toCharArray();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            if (j == 0 || arr[i] != arr[j - 1]) {
                arr[j] = arr[i];
                j++;
            } else {
                j--;
            }
        }

        return new String(arr, 0, j);
    

    }
}
