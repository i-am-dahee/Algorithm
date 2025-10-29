class Solution {
    public String solution(String s) {
        String answer = "";
        char[] list = s.toCharArray();
        int index = 0;
        
        for (int i = 0; i < list.length; i++) {
            if (list[i] == ' ') {
                index = 0;
                continue;
            }
            
            if (index % 2 == 0) {
                list[i] = Character.toUpperCase(list[i]);
            } else {
                list[i] = Character.toLowerCase(list[i]);
            }
            
            index++;
        }
        answer = String.valueOf(list);
        
        return answer;
    }
}