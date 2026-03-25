import java.util.HashMap;
import java.util.Map;

public class countelementswithmaxfrequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0; int res = 0;
        for(int n : nums){
            int freq = map.getOrDefault(n,0) + 1;
            map.put(n,freq);

        if(freq > maxFreq){
            maxFreq = freq;
            res = freq;
        }else if(freq == maxFreq){
            res = res + freq;
        }
        }

        return res;
    }
}
