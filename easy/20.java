class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i) == ')'){
                    if (stack.isEmpty() || stack.pop() != '('){
                        return false;
                    }
                } else if (s.charAt(i) == '}'){
                    if (stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                } else {
                    if (stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
