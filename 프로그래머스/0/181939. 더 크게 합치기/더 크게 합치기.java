class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sb1 = new StringBuilder(Integer.toString(a));
        sb1.append(Integer.toString(b));
        
        StringBuilder sb2 = new StringBuilder(Integer.toString(b));
        sb2.append(Integer.toString(a));
        
        int num1 = Integer.parseInt(sb1.toString());
        int num2 = Integer.parseInt(sb2.toString());
        
        return num1 >= num2 ? num1 : num2;
        
        
    }
}