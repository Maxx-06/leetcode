class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        int maxCurr = 0;
        int minCurr = 0;

        for(int i=0; i < nums.length; i++){
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