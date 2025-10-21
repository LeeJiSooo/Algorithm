class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("right")){
            for(int i = 0; i < numbers.length; i++){
                if(i == numbers.length - 1){
                    answer[0] = numbers[i];   
                }else{
                    answer[i+1] = numbers[i];
                }
            }
        }else{
            for(int i = 0; i < numbers.length; i++){
                if(i == numbers.length - 1){
                    answer[i] = numbers[0];
                }else{
                    answer[i] = numbers[i + 1];
                }
            }
        }
        return answer;
    }
}