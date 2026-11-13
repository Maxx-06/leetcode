class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int result = 0;
        int n = s.length();
        if(n == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int high = 0; high < n; high++) {
            // char c = s.charAt(high);
            // map.put(c, map.getOrDefault(c, 0) + 1);
            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);
            int len = high - low + 1;
            while (map.size() < len) {
                // char d = s.charAt(low);
                // map.put(d, map.get(d) - 1);
                map.put(s.charAt(low), map.get(s.charAt(low)) - 1);

                if (map.get(s.charAt(low)) == 0) {
                    map.remove(s.charAt(low));
                }
                low++;
                len = high - low + 1;
            }

            result = Math.max(result, high-low+1);
        }

        return result;
    }
}