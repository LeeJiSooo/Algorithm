class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int len = num_list.length;
        
        if(len >= 11){
            for(int i = 0; i < len; i++){
                answer += num_list[i];
            }
        }else{
            for(int i = 0; i < len; i++){
                mul *= num_list[i];
            }
            answer = mul;
        }
        
        return answer;
    }
}