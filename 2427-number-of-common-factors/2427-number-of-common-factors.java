// class Solution {
//     public int commonFactors(int a, int b) {
//         int count = 0;

//         for(int i=1; i<= Math.min(a,b); i++){
//             if(a % i == 0 && b % i ==0 ) {
//                 count++;
//             }
//         }

//         return count;
//     }
// }


class Solution {
    public int commonFactors(int a, int b) {
        int gcd = findGCD(a, b);
        int count = 0;

        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                count++;
            }
        }

        return count;
    }

    public int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}