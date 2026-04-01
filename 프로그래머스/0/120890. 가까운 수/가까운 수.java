class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Math.abs(n - array[0]);
        int index = 0;
        
        for(int i = 1; i < array.length; i++){
            int diff = Math.abs(n - array[i]);
            if(min > diff){
                min = diff;
                index = i;
            }else if(min == diff){
                if(array[index] > array[i]){
                    index = i;
                }
            }
        }
        
        answer = array[index];
        
        return answer;
    }
}