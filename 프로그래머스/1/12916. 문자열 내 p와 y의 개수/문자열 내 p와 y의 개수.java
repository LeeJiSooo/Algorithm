class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int numS = 0;
        int numY = 0;
        int len = s.length();
        
        for(int i = 0; i < len; i++){
            char c = s.charAt(i);
            if(c == 'p' || c == 'P'){
                numS++;
            }else if(c == 'y' || c == 'Y'){
                numY++;
            }
        }
        
        if(numS != numY){
            answer = false;
        }

        return answer;
    }
}