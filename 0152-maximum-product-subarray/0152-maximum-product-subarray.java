class Solution {
    public int maxProduct(int[] nums) {
        int best = nums[0];
        int ans = nums[0];
        int prev = nums[0];

        for(int i = 1; i < nums.length; i++) {
            int v2 = best * nums[i];
            int v3 = prev * nums[i];
            best = Math.max( nums[i] , Math.max( v2,v3 ));
            prev = Math.min( nums[i] , Math.min( v2,v3 ));
            ans = Math.max( ans, Math.max( best, prev ));
        }

        return ans;
    }
}