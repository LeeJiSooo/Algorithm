class Solution {
    public int solution(int num) {
        if(num == 1){
            return 0;
        }
        
        long n = (long) num;
        int count = 0;
        
        while(n != 1){
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = 3 * n + 1;
            }
            count++;
            
            if(count == 500){
                return -1;
            }
        }
    
        
        return count;
    }
}