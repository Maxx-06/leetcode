import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    ls.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    // Skip duplicate right elements
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ls;
    }
}