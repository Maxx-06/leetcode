class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        int leftSum = 0;
        int n = nums.length;

        for(int i=0; i < n ; i++) {
            if(nums[n-1] - nums[i] == leftSum) {
                return i;
            } 
            leftSum = nums[i];
        }

        return -1;
    }
}