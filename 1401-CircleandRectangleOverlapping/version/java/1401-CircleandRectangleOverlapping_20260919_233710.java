// Last updated: 9/19/2026, 11:37:10 PM
1class Solution {
2    public boolean checkOverlap(int radius, int xCenter, int yCenter,
3                                int x1, int y1, int x2, int y2) {
4
5        int x = Math.max(x1, Math.min(xCenter, x2));
6        int y = Math.max(y1, Math.min(yCenter, y2));
7
8        int dx = x - xCenter;
9        int dy = y - yCenter;
10
11        return dx * dx + dy * dy <= radius * radius;
12    }
13}