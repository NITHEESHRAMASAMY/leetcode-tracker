// Last updated: 8/1/2026, 10:55:01 PM
1class Solution {
2    public void setZeroes(int[][] mat) {
3        int n=mat.length;
4        int m=mat[0].length;
5        boolean[] row=new boolean[n];
6        boolean[] col=new boolean[m];
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                if(mat[i][j]==0){
10                    row[i]= true;
11                    col[j]=true;
12                }
13
14            }
15        }
16            for(int i=0;i<n;i++){
17            for(int j=0;j<m;j++){
18                if(row[i] || col[j]){
19                    mat[i][j]=0;
20                }
21            }
22        }
23    }
24}