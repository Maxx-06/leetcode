
class Solution {
    public int findDuplicate(int[] nums) {
        int[] copy = new int[nums.length];

        for (int num : nums) {
            if (copy[num] > 0) {
                return num;
            }
            copy[num]++;
        }

        return -1;
    }
}
