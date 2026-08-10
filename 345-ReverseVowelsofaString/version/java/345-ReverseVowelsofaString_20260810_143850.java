// Last updated: 8/10/2026, 2:38:50 PM
1class Solution {
2    public int countSegments(String s) {
3        if(s.length()==0){
4            return 0;
5        }
6        String arr[]=s.split(" ");
7        int c=0;
8        for(int i=0;i<arr.length;i++){
9            //char ch=s.charAt(i);
10              if (!arr[i].equals("")) {
11            c++;
12              }
13        }
14        return c;
15    }
16}