class Solution {
    public boolean canAliceWin(int n) {
        // int take = 10;
        // int steps = 0;

        // while(n >= take) {
        //     n -= take;
        //     take--;
        //     steps++;
        // }

        // return (steps % 2 == 0) ? false : true;

        // concept of arithmetic progression 
        int k = (int)(21 - Math.sqrt(441 - 8*n))/2;

        return (k % 2 == 1);

    }
}