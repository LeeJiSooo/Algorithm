class Solution {
    public String solution(String str1, String str2) {
        String answer = ""; 
        int len = str1.length();
        
        for(int i = 0; i < len; i++){
            String buffer = String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
            answer += buffer;
        }
        return answer;
    }
}