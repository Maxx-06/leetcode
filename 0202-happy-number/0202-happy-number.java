class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = squareDigits(slow);
            fast = squareDigits(fast);
            fast = squareDigits(fast);

        } while(slow!=fast);

        if(slow == 1){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static int squareDigits(int n){
        int ans=0;

        while(n > 0){
            int digit = n%10;
            ans = ans + digit * digit;
            n = n/10;
        }
        return ans;
    }
}