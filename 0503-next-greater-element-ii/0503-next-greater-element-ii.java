// class Solution {
//     public int[] nextGreaterElements(int[] nums) {

//         // (i + 1) % n	Move one step forward
//         // (i - 1 + n) % n	Move one step backward
//         // (i + k) % n	Move k steps forward
//         // (start + i) % n	Start at start, then move i steps forward
//         // (start - i + n) % n	Start at start, then move i steps backward

//         int n = nums.length;
//         int[] result = new int[n];

//         Stack<Integer> stack = new Stack<>();
//         HashMap<Integer, Integer> hash = new HashMap<>();

//         // 1 2 1
//         for (int i = n * 2; i >= 0; i--) {

//             int index = i % n;

//             if (stack.isEmpty()) {
//                 result[index] = -1;
//             } else if (stack.size() != 0 && stack.peek() > nums[index]) {
//                 result[index] = stack.peek();

//             } else if (stack.size() != 0 && stack.peek() <= nums[index]) {

//                 while (stack.size() != 0 && stack.peek() <= nums[index]) {
//                     stack.pop();
//                 }

//                 if (stack.size() == 0) {
//                     result[index] = -1;
//                 } else {
//                     result[index] = stack.peek();
//                 }
//             }

//             stack.push(nums[index]);
//         }

//         return result;
//     }
// }



class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];

        Arrays.fill(result, -1);

        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            // Remove smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }

            // Find next greater element
            if (!stack.isEmpty() && i < n) {
                result[index] = stack.peek();
            }

            // Push current element
            stack.push(nums[index]);
        }

        return result;
    }
}