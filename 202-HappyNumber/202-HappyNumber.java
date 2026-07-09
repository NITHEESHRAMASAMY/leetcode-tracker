// Last updated: 7/9/2026, 11:49:43 AM
class Solution {
    public boolean isHappy(int n) {
       while(n!=1 && n!=4){
        int s=0;
        while(n>0){
            int dig=n%10;
            s+=dig*dig;
            n/=10;
        }
        n=s;
       }
       return n==1;
    }
}