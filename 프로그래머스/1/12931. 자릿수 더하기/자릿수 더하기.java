import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int value = 0;

        while (n > 0) {
            value = n % 10;
            n = n / 10;
            answer += value;
        }

        return answer;
    }
}