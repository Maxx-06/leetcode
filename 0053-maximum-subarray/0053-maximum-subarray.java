class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
        // int best = nums[0];
        // int ans = nums[0];

        // for(int i=1; i<nums.length; i++) {
        //     best = Math.max(best + nums[i], nums[i]);
        //     ans = Math.max(best, ans);
        // }

        // return ans == Integer.MIN_VALUE ? nums[0] : ans;
    }
}