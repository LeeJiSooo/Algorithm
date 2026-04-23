class Solution {
    public long solution(int price, int money, int count) {

        long sum = 0;
        int nPrice = 0;
        
        for(int i = 1; i <= count; i++){
            nPrice = i * price;
            sum += (long)nPrice;
        }
        
        if(money >= sum){
            return 0;
        }
        
        return sum - money;
    }
}