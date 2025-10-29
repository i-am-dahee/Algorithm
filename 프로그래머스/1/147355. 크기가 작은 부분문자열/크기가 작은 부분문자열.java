class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int pLen = p.length();
        
        for (int i = 0; i <= t.length() - pLen; i++) {
            String x = t.substring(i, i + pLen);
            if (x.compareTo(p) <= 0) {
                answer ++;
            }
        }
        return answer;
    }
}