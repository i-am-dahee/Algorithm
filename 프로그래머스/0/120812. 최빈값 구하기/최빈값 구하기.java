import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {          
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int maxCount = 0;
        int maxValue = 0;
        
        boolean duplicate = true;
        
        for (int key : map.keySet()) {          
            int count = map.get(key);
            
            if (count > maxCount) {
                
                maxCount = count;
                maxValue = key;
                
                duplicate = true;
                
            } else if (count == maxCount) {                
                duplicate = false;
            }
        }
        
        if (duplicate == false) {            
            return -1;
        }
        
        return maxValue;
    }
}