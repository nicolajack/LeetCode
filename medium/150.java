class Solution {
    public int evalRPN(String[] tokens) {
        int firstOp;
        int secondOp;
        Stack<Integer> ints = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            if (!(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))){
                ints.push(Integer.parseInt(tokens[i]));
            } else {
                secondOp = ints.pop();
                firstOp = ints.pop();
                if (tokens[i].equals("+")){
                    ints.push(firstOp + secondOp);
                } else if (tokens[i].equals("-")){
                    ints.push(firstOp - secondOp);
                } else if (tokens[i].equals("*")){
                    ints.push(firstOp * secondOp);
                } else {
                    ints.push(firstOp / secondOp);
                }
            }
        }
        return ints.pop();
    }
}
