// Last updated: 7/13/2026, 9:41:08 AM
1class Solution {
2    public boolean searchMatrix(int[][] mat, int tar) {
3        boolean a=false;
4        for(int i=0;i<mat.length;i++){
5            for(int j=0;j<mat[0].length;j++){
6                if(mat[i][j]==tar){
7                a=true;
8                return a;
9               //  else a=false;
10               }
11            }
12        }
13        return a;
14    }
15}