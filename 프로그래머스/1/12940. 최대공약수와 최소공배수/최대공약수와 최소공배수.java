class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        answer[0] = getGCD(n, m);
        answer[1] = n * m / answer[0];
        
        return answer;
    }
    
    private int getGCD(int a, int b) {
        while (a != 0) {
            int r = b % a;
            b = a;
            a = r;
        }
        
        return b;
    }
}