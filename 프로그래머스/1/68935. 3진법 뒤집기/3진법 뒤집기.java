class Solution {
    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n, 3);
        
        StringBuilder sb = new StringBuilder(num);
        sb.reverse();
        answer = Integer.parseInt(sb.toString(), 3);
        
        return answer;
    }
}