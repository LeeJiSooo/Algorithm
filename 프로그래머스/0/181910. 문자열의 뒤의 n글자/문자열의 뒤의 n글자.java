class Solution {
    public String solution(String my_string, int n) {
        int len = my_string.length();
        StringBuilder sb = new StringBuilder();
        
        for(int i = len - n; i < len; i++){
            sb.append(my_string.charAt(i));        
        }
        
        return sb.toString();
    }
}