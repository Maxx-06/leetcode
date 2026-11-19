class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1;
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(min >= nums[i]){
                min = nums[i];
            }
            else {
                max = Math.max(max, nums[i]-min);
            }
        }

        return max;
    }
}