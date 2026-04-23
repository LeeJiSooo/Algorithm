class Solution {
    public String solution(String my_string, int[][] queries) {

        StringBuilder sb = new StringBuilder(my_string);
        
        for(int i = 0; i < queries.length; i++){
            int first = queries[i][0];
            int last = queries[i][1];
            
            String sub = sb.substring(first, last + 1);
            
            StringBuilder reversed = new StringBuilder(sub).reverse();
            
            sb.replace(first, last + 1, reversed.toString());
                
        }
        return sb.toString();
    }
}