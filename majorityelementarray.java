import java.util.HashMap;

public class majorityelementarray {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for(int num : nums){
            int count =  m.getOrDefault(num, 0) + 1;
            if(count > n/2){
                return num;
            }

            m.put(num, count);
        }

        return -1;
    }
}
