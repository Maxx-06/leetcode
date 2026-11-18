
class Solution {
    public int findDuplicate(int[] nums) {

        // first solution using extra space
        // int[] copy = new int[nums.length];

        // for (int num : nums) {
        //     if (copy[num] > 0) {
        //         return num;
        //     }
        //     copy[num]++;
        // }

        // return -1;
        


        // second solution using slow - fast pointer
         int slow = 0;
        int fast = 0;

        // Phase 1: Find intersection
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find cycle entrance
        slow = 0;

        while (fast != slow) {
            fast = nums[fast];
            slow = nums[slow];
        }

        return fast;

    }
}
