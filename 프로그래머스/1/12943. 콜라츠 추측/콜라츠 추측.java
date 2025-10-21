class Solution {
    public int solution(int num) {
        long n = num;
        int i = 0;
        
        if (n == 1) {
            return 0;
        }
        
        while (n != 1 && i < 500) {          
            n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
            i++;
        }
        
        if (i == 500) {
            return -1;
        }
        
        return i;
    }
}