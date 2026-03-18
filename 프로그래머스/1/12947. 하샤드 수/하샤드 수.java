class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        
        int temp = x;
        
        while(temp / 10 != 0){
            sum += temp % 10;
            temp = temp / 10;
        }
        
        sum += temp;
        
        if(x % sum != 0){
            answer = false;
        }
        return answer;
    }
}