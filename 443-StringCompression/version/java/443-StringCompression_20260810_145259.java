// Last updated: 8/10/2026, 2:52:59 PM
1class Solution {
2    public int vowelConsonantScore(String s) {
3        s=s.toLowerCase();
4        int v=0;
5        int con=0;
6        for(int i=0;i<s.length();i++){
7            char ch =s.charAt(i);
8            if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
9                 v++;
10            }
11            else if(ch >='a' && ch <= 'z'){
12                con++;
13            }
14        }
15         if (con == 0) {
16            return 0;
17        }
18        return v/con;
19    }
20}