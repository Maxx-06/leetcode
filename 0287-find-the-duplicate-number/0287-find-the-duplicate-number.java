
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
        // int len = nums.length;
        // int slow = 0;
        // int fast = 0;
        // boolean meet = false;
        // while (fast < len && nums[fast] < len)
        //  {
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        //     if(fast == slow){
        //         meet = true;
        //         break;
        //     };
        // }


        // if(meet) {
        //     int ptr = 0;
        //     while(ptr != slow){
        //         ptr = nums[ptr];
        //         slow = nums[slow];
        //     }
        //     return ptr;
        // }

        // return -1;

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
