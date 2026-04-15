import java.util.HashMap;
import java.util.Map;
import java.util.*;
class leet169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums) map.put(n, map.getOrDefault(n, 0)+1);
        int maxFreq = 0;
        for(int i=0; i<nums.length; i++){
            maxFreq = Math.max(map.get(nums[i]), maxFreq);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==maxFreq) return entry.getKey();
        }
        return -1;
    }
}