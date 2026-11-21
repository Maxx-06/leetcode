class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        sum = 0;
        int n = nums.length;

        for(int i=0; i < n ; i++) {
            if(nums[n-1] - nums[i] == sum) {
                return i;
            } 
            sum = nums[i];
        }

        return -1;
    }
}