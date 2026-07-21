class Solution {
    public int missingNumber(int[] nums) {
        // sum of n integer 
        // int len = nums.length;
        // int sum = ((len + 1)*(len))/2;
        // for (int i =0; i<len; i++){
        //     sum = sum - nums[i];
        // }
        // return sum;


        // this approach using bitwise xor to eliminate duplicate and left missing num
        int len = nums.length;
        int res = 0;
        for(int n:nums){
            res = res ^ n;
        }

        for(int i=0; i<=nums.length; i++){
            res = res ^ i;
        }

        return res;
    }
}