// class Solution {
//     public static int find(int[] arr) {
//         int max = 0;
//         for (int i = 0; i < arr.length; i++) {
//             max = Math.max(max, arr[i]);
//         }

//         return max;
//     }

//     public int characterReplacement(String s, int k) {
//         int low = 0;
//         int[] arr = new int[26];
//         int n = s.length();
//         int result = Integer.MIN_VALUE;

//         for (int high = 0; high < n; high++) {
//             int c = s.charAt(high);
//             int index = c - 'A';
//             arr[index]++;
//             int max = find(arr);
//             int len = high - low + 1;

//             while (len - max > k) {
//                 int d = s.charAt(low);
//                 index = d - 'A';
//                 arr[index]--;
//                 low++;
//                 max = find(arr);
//                 len = high - low + 1;
//             }
//             result = Math.max(result, len);

//         }

//         return result;
//     }
// }

class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        int[] freq = new int[26];

        for(int right = 0; right < s.length(); right++){
           char ch = s.charAt(right);
           freq[ch - 'A']++;

           maxFreq = Math.max(maxFreq, freq[ch - 'A'] );

           while( (right - left + 1) - maxFreq > k ){
            char leftChar = s.charAt(left);
            freq[ leftChar - 'A' ]--;
            left++;
           }

           maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}