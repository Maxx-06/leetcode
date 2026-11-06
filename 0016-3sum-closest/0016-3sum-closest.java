class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff =100000;
        int res = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int newTarget = target - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == newTarget) {
                    res = sum + nums[i];
                    return res;
                } else if (sum < newTarget) {
                    left++;
                    if(Math.abs(newTarget-sum) < diff) {
                        diff = Math.abs(newTarget-sum);
                        res = sum + nums[i];
                    }
                } else {
                    right--;
                    if(Math.abs(newTarget-sum) < diff) {
                        diff = Math.abs(newTarget-sum);
                        res = sum + nums[i];
                    }
                }
            }
        }

        return res;
    }
}