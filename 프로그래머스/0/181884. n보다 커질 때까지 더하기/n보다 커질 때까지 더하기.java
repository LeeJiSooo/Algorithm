class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int len = numbers.length;
        int sum = 0;
        
        for(int i = 0; i < len; i++){
            sum += numbers[i];
            if(sum > n){
                break;
            }
        }
        
        answer = sum;
        
        return answer;
    }
}