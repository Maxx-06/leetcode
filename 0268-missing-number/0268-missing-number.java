class Solution {
    public int missingNumber(int[] nums) {
        // int len = nums.length;
        // int sum = ((len + 1)*(len))/2;
        // for (int i =0; i<len; i++){
        //     sum = sum - nums[i];
        // }
        // return sum;

        int len = nums.length;
        int res = nums[0];
        for(int i=1; i<len; i++){
            res = res ^ nums[i];
        }

        while(len>=0) {
            res = res ^ len;
            len--;
        }

        return res;
    }
}