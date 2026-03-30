class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i = 0; i < queries.length; i++){
            int first = queries[i][0];
            int last = queries[i][1];
            
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        
        return arr;
    }
}