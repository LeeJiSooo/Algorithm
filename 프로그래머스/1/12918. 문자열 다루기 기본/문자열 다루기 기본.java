class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int len = s.length();
        
        if(len == 4 || len == 6){
            for(int i = 0; i < len; i++){
                char c = s.charAt(i);
                if(!Character.isDigit(c)){
                    answer = false;
                }
            }
        }else{
            answer = false;
        }
        
        return answer;
    }
}