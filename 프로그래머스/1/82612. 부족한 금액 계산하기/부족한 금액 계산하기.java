class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        for (int i = 1; i <= count; i++) {
            total += (long) price * i;
        }
        
        long result = (long) total - money;
        if (result > 0) {
            return result;
        } else {
            return 0;
        }
    }
}