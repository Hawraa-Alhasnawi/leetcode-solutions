import java.util.Stack;
class Solution {
    public String removeStars(String s) {
        //make string to store result;
        String res = "";

        //make a stack and add the elements into it
        Stack<Character> stack_string = new Stack<>();

        for(int i=0; i<s.length(); i++){
            //push into stack
           if(s.charAt(i)=='*'){
                if(!stack_string.isEmpty()){
                    stack_string.pop();
                }
           }
           else {
            stack_string.push(s.charAt(i));
           }
        }
        // Build the result string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack_string) {
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String input1 = "leet**cod*e";
        String input2 = "erase*****";
        String input3 = "abc*d*e*";
        String input4 = "a*b*c*";

        System.out.println("Input: " + input1 + " -> Output: " + solution.removeStars(input1)); // Expected: "lecoe"
        System.out.println("Input: " + input2 + " -> Output: " + solution.removeStars(input2)); // Expected: ""
        System.out.println("Input: " + input3 + " -> Output: " + solution.removeStars(input3)); // Expected: ""
        System.out.println("Input: " + input4 + " -> Output: " + solution.removeStars(input4)); // Expected: ""
    }
}