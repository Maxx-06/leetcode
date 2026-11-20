// class Solution {
//     public int maxAbsoluteSum(int[] nums) {
//         int max = 0;
//         int min = 0;
//         int ans = 0;

//         for(int i = 0; i < nums.length; i++){
//             max = Math.max(max + nums[i], nums[i]);
//             min = Math.min(min + nums[i], nums[i]);

//             ans = Math.max(ans, Math.max(max, Math.abs(min)));

//         }

//         return ans;
//     }
// }


class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int MaxEnding = 0;
        int MinEnding = 0;
        int answer = 0;

        for(int i = 0; i < nums.length ; i++){
            MaxEnding = Math.max(MaxEnding + nums[i], nums[i]);
            MinEnding = Math.min(MinEnding + nums[i], nums[i]);
            answer = Math.max(answer, Math.max(MaxEnding, -MinEnding));
        }
        return answer;
        
    }
}