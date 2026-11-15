// class Solution {
//     public static boolean check(int[] s, int[] t) {
//         for (int i = 0; i < 128; i++) {
//             if (s[i] < t[i]) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public String minWindow(String s, String t) {
//         int[] Sarr = new int[128];
//         int[] Tarr = new int[128];

//         for (int i = 0; i < t.length(); i++) {
//             char ch = t.charAt(i);
//             Tarr[ch]++;
//         }

//         int left = 0;
//         int low = 0;
//         int res = Integer.MAX_VALUE;

//         for (int right = 0; right < s.length(); right++) {
//             char chs = s.charAt(right);
//             Sarr[chs]++;
//             while (check(Sarr, Tarr)) {
//                 int len = right - left + 1;
//                 if (res > len) {
//                     res = len;
//                     low = left;
//                 }
//                 char ls = s.charAt(left);
//                 Sarr[ls]--;
//                 left++;

//             }
//         }

//         return res == Integer.MAX_VALUE
//                 ? ""
//                 : s.substring(low, res + low);

//     }
// }

class Solution {
    public String minWindow(String s, String t) {
        // int sLen = s.length(), tLen = t.length();
        // if (sLen < tLen) return "";

        // int[] counts = new int[128];
        // for (int i = 0; i < tLen; i++) {
        //     counts[t.charAt(i)]++;
        // }

        // int left = 0, start = 0, minLen = Integer.MAX_VALUE, required = tLen;

        // for (int right = 0; right < sLen; right++) {
        //     if (counts[s.charAt(right)]-- > 0) {
        //         required--;
        //     }

        //     while (required == 0) {
        //         if (right - left + 1 < minLen) {
        //             minLen = right - left + 1;
        //             start = left;
        //         }

        //         if (counts[s.charAt(left++)]++ == 0) {
        //             required++;
        //         }
        //     }
        // }

        // return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

        int required = t.length();
        int[] count = new int[128];

        for (int i = 0; i < required; i++) {
            count[t.charAt(i)]++;
        }

        int left = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            if (count[s.charAt(right)]-- > 0) {
                required--;
            }

            while (required == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                if (count[s.charAt(left++)]++ == 0) {
                    required++;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, minLen + start);
    }
}