import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class longestsubstringwithoutrepeatingcharachter {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int max = 0;
        Map<Character, Integer> last = new HashMap<>();
        for(int r = 0; r < s.length(); r++){
            char c  = s.charAt(r);

            if(last.containsKey(c) && last.get(c) >= l){
                l = last.get(c) + 1;
            }

            last.put(c, r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}

class BruteForce{
     public int lengthOfLongestSubstring(String s) {
         int l = 0, r = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        
        while (r < s.length()) {
            char c = s.charAt(r);
            if (!set.contains(c)) {
                set.add(c);
                maxLen = Math.max(maxLen, set.size());
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return maxLen;
      
    }
}
