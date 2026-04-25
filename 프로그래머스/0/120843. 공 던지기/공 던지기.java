class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int len = numbers.length;
        
        int l = 0;
        for(int i = 1; i < k; i++){
            l = l  + 2;
        }
        
        if(l <= len){
            answer = numbers[l];
        }else{
            answer = numbers[l % len];
        }
        return answer;
    }
}