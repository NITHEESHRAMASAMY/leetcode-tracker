// Last updated: 7/11/2026, 9:26:23 AM
1class Solution {
2    public int searchInsert(int[] num, int tar) {
3        int a=0;
4        int b=num.length-1;
5        while(a<=b){
6            int mid=a+(b-a/2);
7            if(num[mid]==tar){
8                return mid;
9            }
10            else if(num[mid]<tar){
11                a=mid+1;
12            }
13            else{
14                b=mid-1;
15            }
16        }
17        return a;
18    }
19}