class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = 1;
        int[] r = new int[nums.length];
        r[nums.length -1] = 1;

            for (int i =1 ; i < nums.length; i++) {
                ans[i] = ans[i-1] * nums[i-1];
                r[nums.length -1 - i] = nums[nums.length-i] * r[nums.length-i];
            }

            for(int i=0; i<nums.length; i++){
                ans[i] = ans[i] * r[i];
            }
    

        return ans;
    }
}