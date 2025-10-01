class Solution {
    public String solution(String n_str) {
    
        
        StringBuilder sb = new StringBuilder();
        
        int num = 1;
        for(int i = 0; i < n_str.length(); i++){
            if(n_str.charAt(i) != '0' || (n_str.charAt(i) == '0' && num == 0)){
                sb.append(String.valueOf(n_str.charAt(i)));
                num = 0;
            }
        }
                          
        
        return sb.toString();
    }
}
