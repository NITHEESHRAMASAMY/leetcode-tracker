// Last updated: 8/16/2026, 11:47:03 PM
1class Solution {
2    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
3
4        int[] d = new int[6];
5
6        d[0] = distance(p1, p2);
7        d[1] = distance(p1, p3);
8        d[2] = distance(p1, p4);
9        d[3] = distance(p2, p3);
10        d[4] = distance(p2, p4);
11        d[5] = distance(p3, p4);
12
13        Arrays.sort(d);
14
15        if (d[0] == 0) {
16            return false;
17        }
18
19        return d[0] == d[1] &&
20               d[1] == d[2] &&
21               d[2] == d[3] &&
22               d[4] == d[5] &&
23               d[4] == 2 * d[0];
24    }
25
26    public int distance(int[] a, int[] b) {
27        int x = a[0] - b[0];
28        int y = a[1] - b[1];
29
30        return x * x + y * y;
31    }
32}