
class Solution {
    public int maxProduct(int[] nums) {
        int best = nums[0];
        int ans = nums[0];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v = nums[i];
            int v2 = best * v;
            int v3 = prev * v;

            int newBest = Math.max(v, Math.max(v2, v3));
            int newPrev = Math.min(v, Math.min(v2, v3));

            best = newBest;
            prev = newPrev;

            ans = Math.max(ans, best);
        }

        return ans;
    }
}
