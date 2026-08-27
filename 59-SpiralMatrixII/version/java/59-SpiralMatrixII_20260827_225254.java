// Last updated: 8/27/2026, 10:52:54 PM
1class Solution {
2    public int[][] generateMatrix(int n) {
3
4        int[][] mat = new int[n][n];
5
6        int top = 0;
7        int bottom = n - 1;
8        int left = 0;
9        int right = n - 1;
10
11        int num = 1;
12
13        while (top <= bottom && left <= right) {
14
15            // Left to right
16            for (int j = left; j <= right; j++) {
17                mat[top][j] = num++;
18            }
19            top++;
20
21            // Top to bottom
22            for (int i = top; i <= bottom; i++) {
23                mat[i][right] = num++;
24            }
25            right--;
26
27            // Right to left
28            if (top <= bottom) {
29                for (int j = right; j >= left; j--) {
30                    mat[bottom][j] = num++;
31                }
32                bottom--;
33            }
34
35            // Bottom to top
36            if (left <= right) {
37                for (int i = bottom; i >= top; i--) {
38                    mat[i][left] = num++;
39                }
40                left++;
41            }
42        }
43
44        return mat;
45    }
46}