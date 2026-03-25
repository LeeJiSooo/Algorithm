class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        int len = numbers.length;
        
        for(int i = 0; i < len; i++){
            sum += numbers[i];    
        }
        
        answer = 45 - sum; 
        
        return answer;
    }
}