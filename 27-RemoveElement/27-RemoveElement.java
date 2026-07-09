// Last updated: 7/9/2026, 11:49:58 AM
class Solution {
    public int removeElement(int[] num, int val) {
        int c=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                num[c]=num[i];
                c++;
            }
        }
        return c;
    }
}