class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        int j = 0;
        int k = 0;
        
        for (String i : goal) {
            
            if (j < cards1.length && i.equals(cards1[j])) {
                j++;
            } else if (k < cards2.length && i.equals(cards2[k])) {
                k++;
            } else {
                return "No";
            }
        }
        
        return "Yes";
    }
}