import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str = String.valueOf(n);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();
        
        answer = Long.parseLong(sb.toString());
        
        return answer;
    }
}