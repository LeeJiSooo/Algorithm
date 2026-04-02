class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++){
            String s = String.valueOf(array[i]);
            
            char[] c = s.toCharArray();
            
            for(char ch : c){
                if(ch == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}