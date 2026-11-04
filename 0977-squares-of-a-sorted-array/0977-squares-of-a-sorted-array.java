class Solution {
    public int[] sortedSquares(int[] nums) {
        //     int left = 0;
        //     int right = nums.length - 1;
        //     int pos = nums.length - 1;
        //     int[] newArr = new int[nums.length];
        //     while(left <= right) {
        //         int a = nums[left] * nums[left];
        //         int b = nums[right] * nums[right];
        //         if (a > b) {
        //             newArr[pos] = a;
        //             left++;
        //         }
        //         else {
        //             newArr[pos] = b;
        //             right--;
        //         }
        //         pos--;

        //     }

        //     return newArr;
        int left = 0;
        int right = nums.length - 1;
        int[] newArr = new int[nums.length];
        int pos = nums.length - 1;
        while (left <= right) {
            int i = nums[left] * nums[left];
            int j = nums[right] * nums[right];
            if (j >= i ) {
                newArr[pos] = j;
                right--;
                pos--;
            }
            if (i > j) {
                newArr[pos] = i;
                left++;
                pos--;
            }
        }
        return newArr;

    }
}