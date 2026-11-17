class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charArray = new int[26];

        for (int i = 0; i < chars.length(); i++) {
            charArray[chars.charAt(i) - 'a']++;
        }

        int result = 0;

        for(String word : words){
            int [] wordArray = new int[26];
            for (int i = 0; i < word.length(); i++) {
                wordArray[word.charAt(i) - 'a']++;
            }
             boolean fine = true;

            for(int i=0; i<26; i++) {
                if(wordArray[i] > charArray[i]) {
                    fine = false;
                    break;
                }
            }

            if(fine == true) {
                result += word.length();
            }




        }

        return result;
    }
}