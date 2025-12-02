class Solution {
    public String solution(int a, int b) {
        
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        int sum = b;
        String answer;
        
        for (int i = 0; i < a - 1; i++) {
            sum = sum + day[i];
        }
        
        answer = week[(sum + 4) % 7];
        
        return answer;
    }
}