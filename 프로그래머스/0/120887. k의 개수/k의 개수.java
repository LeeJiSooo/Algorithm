class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char ch = Character.forDigit(k, 10);
        
        for(int m = i; m <= j; m++){
            String s = String.valueOf(m);
            
            for(int n = 0; n < s.length(); n++){
                char c = s.charAt(n);
                if(c == ch){
                    answer++;
                }
            }
        }
        return answer;
    }
}