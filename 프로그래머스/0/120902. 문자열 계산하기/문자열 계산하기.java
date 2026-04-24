class Solution {
    public int solution(String my_string) {
        
        String[] st = my_string.split(" ");
        
        int answer = Integer.parseInt(st[0]);
        
        for(int i = 1; i < st.length; i += 2){
            String operator = st[i];
            int nextNum = Integer.parseInt(st[i + 1]);
            
            if(operator.equals("+")){
                answer += nextNum;
            }else{
                answer -= nextNum;
            }
        }
        
        return answer;
    }
}