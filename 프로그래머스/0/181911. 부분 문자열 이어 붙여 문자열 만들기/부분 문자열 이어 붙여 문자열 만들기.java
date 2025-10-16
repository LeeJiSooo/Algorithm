class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < my_strings.length; i++){
            int a = parts[i][0];
            int b = parts[i][1];
            
            for(int j = a; j <= b; j++){
                sb.append(my_strings[i].charAt(j));
            }
        }
        return sb.toString();
    }
}