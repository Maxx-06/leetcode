class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;
        // int sum = 0;

        int max = nums[0];
        int min = nums[0];
        int sum = nums[0];

        int maxCurr = nums[0];
        int minCurr = nums[0];

        for(int i = 1; i < nums.length; i++){
           maxCurr = Math.max(maxCurr + nums[i], nums[i]);
           max = Math.max(max, maxCurr);

           minCurr = Math.min(minCurr + nums[i], nums[i]);
           min = Math.min(min, minCurr);

           sum += nums[i];
        }

        if(max < 0)
        return max;

        return Math.max(max, sum - min);
    }
}