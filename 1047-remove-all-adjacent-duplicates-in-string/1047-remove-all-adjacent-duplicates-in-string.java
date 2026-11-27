class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (stack.isEmpty() || ch != stack.peek()) {
                stack.push(ch);
            } else {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();

        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();

    }
}