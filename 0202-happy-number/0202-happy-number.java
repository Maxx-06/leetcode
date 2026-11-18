class Solution {
    public static int fun(int x) {
        int sum = 0;
        while (x != 0){
            sum += (x % 10) * (x % 10);
            x = x / 10;
        }

        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast != 1) {
            slow = fun(slow);
            fast = fun(fun(fast));

            if(slow == fast && slow != 1){
                return false;
            }
        }

        return true;
    }
}