// Last updated: 7/31/2026, 12:33:17 PM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] vv1=version1.split("\\.");
4        String[] vv2=version2.split("\\.");
5        int n=Math.max(vv1.length,vv2.length);
6        int a=1;
7        int b=-1;
8        for(int i=0;i<n;i++){
9            int v1=(i<vv1.length) ? Integer.parseInt(vv1[i]) : 0;
10             int v2=(i<vv2.length) ? Integer.parseInt(vv2[i]) : 0;
11             if(v1 > v2){
12            return a;
13        }
14        if(v2 > v1){
15            return b;
16        }
17        }
18        return 0;
19    }
20}