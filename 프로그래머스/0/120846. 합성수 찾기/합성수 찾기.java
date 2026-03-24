class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 4; i <= n; i++){
            int num = 0;
            for(int l = 1; l <= i; l++){
               if(i % l == 0){
                   num++;
               } 
            }
            if(num >= 3){
                answer++;
            }
        }
        return answer;
    }
}