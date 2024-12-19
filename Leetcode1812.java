import java.util.Arrays;
import java.util.Stack;


class Solution{
    public int[] StackUsageLeetcodeStreak(int[] prices){
        int[] res = Arrays.copyOf(prices, prices.length);
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && res[stack.peek()] >= prices[i]){
                int j = stack.pop();
                res[j] -= prices[i];
            }
            stack.push(i);
        }
        return res;
    }
}