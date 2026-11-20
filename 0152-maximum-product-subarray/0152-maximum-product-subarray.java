class Solution {
    public int maxProduct(int[] nums) {
        int best = nums[0];
        int ans = nums[0];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            int newBest = Math.max(curr, Math.max(best * curr, prev * curr));
            int newPrev = Math.min(curr, Math.min(best * curr, prev * curr));

            best = newBest;
            prev = newPrev;

            ans = Math.max(ans, best);
        }

        return ans;
    }
}