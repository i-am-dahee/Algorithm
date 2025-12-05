class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        int value = GDC(numer, denom);
        
        return new int[] {numer / value, denom / value};
    }
    
    private int GDC(int x, int y) {
        
            if (y == 0) { 
                return x; 
            }
        
            return GDC(y, x % y);
        }
}