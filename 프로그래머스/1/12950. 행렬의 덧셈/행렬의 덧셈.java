class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rowNum = arr1.length;
        int colNum = arr1[0].length;
        
        int[][] answer = new int[rowNum][colNum];
        
        for(int i = 0; i < rowNum; i++){
            for(int j = 0; j < colNum; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}