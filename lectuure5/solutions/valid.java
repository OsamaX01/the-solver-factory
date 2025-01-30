class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty()) {
                if ((stack.peek() == '[' && c == ']') ||
                    (stack.peek() == '{' && c == '}') ||
                    (stack.peek() == '(' && c == ')')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}