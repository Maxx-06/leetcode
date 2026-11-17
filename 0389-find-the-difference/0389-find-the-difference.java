class Solution {
    //  sum of all char than minus
    //  freq array 
    // hashmap
    // xor all char
    public char findTheDifference(String s, String t) {
        // int[] arr = new int[26];

        // for (int i = 0; i < t.length(); i++) {
        //     arr[t.charAt(i) - 'a']++;
        // }

        // for (int i = 0; i < s.length(); i++) {
        //     arr[s.charAt(i) - 'a']--;
        // }

        // for (int i = 0; i < 26; i++) {
        //     if (arr[i] != 0) {
        //         return (char) ('a' + i);
        //     }
        // }

        
        // return '\0';




        // ---------
        // sum - minus
        //  int sum = 0;

        // for (int i = 0; i < t.length(); i++) {
        //     sum = sum + t.charAt(i);
        // }

        // for (int i = 0; i < s.length(); i++) {
        //     sum = sum - s.charAt(i);
        // }


        
        // return sum == 0 ? '\0': (char)sum;


        // -------------
        // XOR

        int sum = t.charAt(0);
        for (int i = 1; i < t.length(); i++) {
            sum = sum ^ t.charAt(i);
        }

        for (int i = 0; i < s.length(); i++) {
            sum = sum ^ s.charAt(i);
        }
        return (char)sum;
    }
}