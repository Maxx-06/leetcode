class Solution {
    public int maximumSum(int[] arr) {
        int no_del = arr[0];
        int with_del = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {
            int temp_no_del = Math.max(no_del + arr[i], arr[i]);
            with_del = Math.max(with_del + arr[i], no_del);

            no_del = temp_no_del;

            max = Math.max(max, Math.max(no_del, with_del));
        }

        return max;
    }
}