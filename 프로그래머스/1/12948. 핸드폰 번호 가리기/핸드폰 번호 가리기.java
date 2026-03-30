class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        int len = phone_number.length();
        
        for(int i = 0; i < len - 4; i++){
            sb.append("*");
        }
        
        String s = phone_number.substring(len - 4);
        sb.append(s);
        
        return sb.toString();
    }
}