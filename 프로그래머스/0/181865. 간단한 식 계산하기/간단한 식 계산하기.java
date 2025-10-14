class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] array = binomial.split(" ");
        
        int a = Integer.parseInt(array[0]);
        String op = array[1];
        int b = Integer.parseInt(array[2]);
        
        if(op.equals("+")){
            answer = a + b;
        }else if(op.equals("-")){
            answer = a - b;
        }else{
            answer = a * b;
        }
        return answer;
    }
}