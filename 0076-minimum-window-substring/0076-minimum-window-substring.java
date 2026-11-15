class Solution {
    public static boolean check(int[] s, int[] t) {
        for (int i = 0; i < 256; i++) {
            if (s[i] < t[i]) {
                return false;
            }
        }

        return true;
    }

    public String minWindow(String s, String t) {
        int[] Sarr = new int[256];
        int[] Tarr = new int[256];

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            Tarr[ch]++;
        }

        int left = 0;
        int low = 0;
        int res = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {
            char chs = s.charAt(right);
            Sarr[chs]++;
            while (check(Sarr, Tarr)) {
                int len = right - left + 1;
                if (res > len) {
                    res = len;
                    low = left;
                }
                char ls = s.charAt(left);
                Sarr[ls]--;
                left++;

            }
        }

        return res == Integer.MAX_VALUE
                ? ""
                : s.substring(low, res + low);

    }
}