class Solution {
    public int solution(String number) {
        int answer = 0;
        int len = number.length();
        int sum = 0;
        
        for(int i = 0; i < len; i++){
            char c = number.charAt(i);
            String s = String.valueOf(c);
            sum += Integer.parseInt(s);
        }
        answer = sum % 9;
        return answer;
    }
}