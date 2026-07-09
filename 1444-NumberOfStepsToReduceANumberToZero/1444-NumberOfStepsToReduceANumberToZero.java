// Last updated: 7/9/2026, 11:49:32 AM
class Solution {
    public int numberOfSteps(int n) {
        int c=0;
        int c1=0;
        int res=0;
        while(n>0){
            if(n%2==0){
               n= n/2;
                c++;
            }
            else if(n%2!=0){
                n=n-1;
                c1++;
            }
            res=c+c1;
        }
        return res;
    }
}