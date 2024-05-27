class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 0, curr = 1;
        for (int i = 1; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
    
}