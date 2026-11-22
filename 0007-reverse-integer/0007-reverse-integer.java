class Solution {
    public int reverse(int x) {
        int original = x;
        int reverse = 0;

        while (original != 0) {
            int digit = original % 10;
            original = original / 10;

            if (reverse > Integer.MAX_VALUE / 10 || reverse < Integer.MIN_VALUE / 10) {
                return 0;
            }

            reverse = (reverse * 10) + digit;
        }

        return reverse;
    }
}