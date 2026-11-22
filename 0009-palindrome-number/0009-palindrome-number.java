class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int reverse = 0;
        while(y > 0) {
            int digit = y % 10;
            y = y / 10;
            reverse = (reverse * 10) + digit;
        }

        return (x == reverse) ? true : false;
    }
}