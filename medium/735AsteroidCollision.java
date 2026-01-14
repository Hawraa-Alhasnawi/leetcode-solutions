import java.util.Stack;
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        // initaize the stack
        Stack<Integer> result = new Stack<>();
        for (int asteroid : asteroids) {
            boolean destroyed = false;
            // handle collision only when asteroid is moving left negative
            while (!result.isEmpty() && asteroid < 0 && result.peek() > 0) {
                // if pop the smaller asteroid
                if (result.peek() < -asteroid) {
                    result.pop();
                }
                // if both are the same size and heading in opposite directions than pop both
                else if (result.peek() == -asteroid) {
                    result.pop();
                    destroyed = true;
                    break;
                }
                else{
                     destroyed = true; // current asteroid explodes
                    break;
                }
            }
            if (!destroyed) {
                result.push(asteroid); // no collision or survived
            }
        }
        // Convert stack to array
        int[] output = new int[result.size()];
        //fill array from right to left, because of stack FILO behavior
        for (int i = result.size() - 1; i >= 0; i--) {
            //everytime the stack is popped the popped element is added to the output array.
            output[i] = result.pop();
        }
        return output;
    }
    
}