// public class anagram {

//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()){
//             return false;
//         }
//         int[] count = new int[26];
//         for(int i=0; i<s.length(); i++){
//             count[s.charAt(i)-'a']++;
//             count[t.charAt(i)-'a']--;
//         }
//         for(int i=0; i<26; i++){
//             if(count[i] != 0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

import java.util.Arrays;

public class anagram{
    public boolean isAnagram(String s, String t) {
      char[] ca1 = s.toCharArray();
      char[] ca2 = t.toCharArray();
      Arrays.sort(ca1);
      Arrays.sort(ca2);
      if(Arrays.equals(ca1,ca2)){
        return true;
      }
    return false;
    }
}