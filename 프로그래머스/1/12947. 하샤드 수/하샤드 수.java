class Solution {
    public boolean solution(int x) {
        
        String str = String.valueOf(x);
        int sum = 0;
        
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        
        if (x % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}