class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        String[] lund = new String[strs.length];

        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            lund[i] = new String(ch);
        }

        HashMap<String, List<String>> lol = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            if (lol.containsKey(lund[i])) {
                lol.get(lund[i]).add(strs[i]);
            }

            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                lol.put(lund[i], list);
            }
        }

        return new ArrayList<>(lol.values());
    }
}