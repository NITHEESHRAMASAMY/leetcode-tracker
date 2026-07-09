// Last updated: 7/9/2026, 11:49:27 AM
class Solution {
    public int smallestEvenMultiple(int n) {
        int res=0;
        if(n%2==0){
            res=n;
        }
        if(n%2!=0){
            res=n*2;
        }
        return res;
    }
}