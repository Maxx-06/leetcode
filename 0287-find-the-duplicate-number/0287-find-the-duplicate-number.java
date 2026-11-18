
// class Solution {
//     public int findDuplicate(int[] nums) {

//         // first solution using extra space
//         // int[] copy = new int[nums.length];

//         // for (int num : nums) {
//         //     if (copy[num] > 0) {
//         //         return num;
//         //     }
//         //     copy[num]++;
//         // }

//         // return -1;
//         // int len = nums.length;
//         // int slow = 0;
//         // int fast = 0;
//         // boolean meet = false;
//         // while (fast < len && nums[fast] < len)
//         //  {
//         //     slow = nums[slow];
//         //     fast = nums[nums[fast]];
//         //     if(fast == slow){
//         //         meet = true;
//         //         break;
//         //     };
//         // }


//         // if(meet) {
//         //     int ptr = 0;
//         //     while(ptr != slow){
//         //         ptr = nums[ptr];
//         //         slow = nums[slow];
//         //     }
//         //     return ptr;
//         // }

//         // return -1;

//          int slow = 0;
//         int fast = 0;

//         // Phase 1: Find intersection
//         do {
//             slow = nums[slow];
//             fast = nums[nums[fast]];
//         } while (slow != fast);

//         // Phase 2: Find cycle entrance
//         int ptr = 0;

//         while (ptr != slow) {
//             ptr = nums[ptr];
//             slow = nums[slow];
//         }

//         return ptr;

//     }
// }


class Solution {
    public int findDuplicate(int[] nums) {
       int slow = 0, fast = 0;

       // start a fast and slow pointer until they meet.
       
       do {                     // this block will run till while condition is true. 
        slow = nums[slow];      // once we reach the start of the cycle
        fast = nums[nums[fast]];// mark slow as 0 again or start or head
       }
       while (slow != fast);

        // as soon as they meet, move both pointers at the same speed
        // until they meet again

        slow = 0;

        // fast kept on moving and eventually they meet at the same point
        // or duplicate or starting of loop or cycle
    
       while (slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
       }
       return slow;

       // this will be the duplicate or the point where they meet or where cycle starts or loop starts
    }
}