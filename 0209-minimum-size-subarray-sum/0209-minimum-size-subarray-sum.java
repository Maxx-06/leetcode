class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int result = Integer.MAX_VALUE;
        int low = 0;
        int high = 0;
        int sum = 0;
        while (high < arr.length) {
            sum += arr[high];
            while (sum >= target) {
                int sub = high - low + 1;
                result = Math.min(result, sub);
                sum = sum - arr[low];
                low++;
            }
            high++;
        }

        return (result == Integer.MAX_VALUE) ? 0 : result;
    }
}