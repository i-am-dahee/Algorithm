import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> result = new TreeSet<>();
        int len = numbers.length;
        
        for (int i=0; i<len-1; i++) {
            for (int j=i+1; j<len; j++) {
                result.add(numbers[i] + numbers[j]);            
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}