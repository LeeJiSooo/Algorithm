class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max1 = 0;
        int rest = 0;
        
        if(sides[0] > sides[1]){
            max1 = sides[0];  
            rest = sides[1];
        }else{
            max1 = sides[1];
            rest = sides[0];
        }
        
        int i = max1 - rest + 1;
        while(i <= max1){
            i++;
            answer++;
        }
        
        for(int j = max1 + 1; j < max1 + rest; j++){
            answer++;
        }
        
        return answer;
    }
}