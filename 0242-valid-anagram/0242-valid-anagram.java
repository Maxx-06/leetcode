// class Solution {
//     public boolean isAnagram(String s, String t) {
//         HashMap<Character, Integer> mp = new HashMap<>();
//         if(s.length() != t.length()){
//             return false;
//         }
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(mp.containsKey(ch)){
//                 mp.put(ch, mp.get(ch) + 1);
//             }
//             else {
//                 mp.put(ch, 1);
//             }
//         }

//          for(int i=0; i<t.length(); i++){
//             char ch = t.charAt(i);
//             if(!mp.containsKey(ch)){
//                 return false;
//             }
//             int val = mp.get(ch);

//             if(val == 1){
//                 mp.remove(ch);
//             }
//             else {
//                 mp.put(ch, mp.get(ch) - 1);
//             }
//         }

//         if (mp.size() != 0) {
//           return false;  
//          }

//         return true;
//     }
// }

// above solution is using hashMap 

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ans=new int[200];
        if(s.length() != t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            ans[s.charAt(i) ]++;
        }

        for(int j=0;j<t.length();j++){
            ans[t.charAt(j)]--;
        }

        for(int k=0;k<ans.length;k++){
            if(ans[k]!=0){
                return false;
            }
        }

        return true;
    }
}