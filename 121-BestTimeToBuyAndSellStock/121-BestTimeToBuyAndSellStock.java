// Last updated: 7/9/2026, 11:49:48 AM
class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int min=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<max){
                max=prices[i];
            }
            int tot=prices[i]-max;
              if(tot>min) min=tot;
        }
        return min;
    }
}