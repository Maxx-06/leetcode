class Solution {
    public int maxProduct(int[] nums) {
        int best = nums[0];
        int ans = nums[0];
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            int newBest = Math.max(curr, Math.max(best * curr, prev * curr));
            int newPrev = Math.min(curr, Math.min(best * curr, prev * curr));

            best = newBest;
            prev = newPrev;

            ans = Math.max(ans, best);
        }

        return ans;
    }
}

// class Solution {
//     public int maxProduct(int[] nums) {
//         int n=nums.length;
//         int max=nums[0];
//         int p=1;
//         for(int i=0;i<n;i++){
//             p*=nums[i];
//             max=Math.max(max,p);
//             if(nums[i]==0) p=1;
//         }
//         p=1;
//         for(int i=n-1;i>=0;i--){
//             p*=nums[i];
//             max=Math.max(max,p);
//             if(nums[i]==0) p=1;
//         }
//         return max;
//     }
// }