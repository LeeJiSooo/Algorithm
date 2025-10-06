class Solution {
    public String[] solution(String[] strArr) {
        
        String[] array = new String[strArr.length];
        int len = strArr.length;
        
        for(int i = 0; i < len; i++){
            if(i % 2 == 0){
                array[i] = strArr[i].toLowerCase();
            }else{
                array[i] = strArr[i].toUpperCase();
            }
        }
        return array;
    }
}