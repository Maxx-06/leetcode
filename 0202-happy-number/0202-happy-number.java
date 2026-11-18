// class Solution {
//     public static int fun(int x) {
//         int sum = 0;
//         while (x != 0){
//             sum += (x % 10) * (x % 10);
//             x = x / 10;
//         }

//         return sum;
//     }
//     public boolean isHappy(int n) {
//         int slow = n;
//         int fast = n;

//         while(fast != 1) {
//             slow = fun(slow);
//             fast = fun(fun(fast));

//             if(slow == fast && slow != 1){
//                 return false;
//             }
//         }

//         return true;
//     }
// }


class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        do{
            slow = squareDigits(slow);
            fast = squareDigits(squareDigits(fast));

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