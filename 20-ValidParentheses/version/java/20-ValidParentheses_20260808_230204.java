// Last updated: 8/8/2026, 11:02:04 PM
1class Solution {
2    public int passwordStrength(String p) {
3        int a = 1;
4        int b = 2;
5        int c = 3;
6        int d = 5;
7        int res = 0;
8        boolean[] lower = new boolean[26];
9        boolean[] upper = new boolean[26];
10        boolean[] digit = new boolean[10];
11        boolean[] special = new boolean[4];
12        for (int i = 0; i < p.length(); i++) {
13            char ch = p.charAt(i);
14            if (Character.isLowerCase(ch)) {
15                int index = ch - 'a';
16                if (!lower[index]) {
17                    res += a;
18                    lower[index] = true;
19                }
20            }
21            else if (Character.isUpperCase(ch)) {
22                int index = ch - 'A';
23                if (!upper[index]) {
24                    res += b;
25                    upper[index] = true;
26                }
27            }
28            else if (Character.isDigit(ch)) {
29                int index = ch - '0';
30                if (!digit[index]) {
31                    res += c;
32                    digit[index] = true;
33                }
34            }
35            else {
36                int index = "!@#$".indexOf(ch);
37                if (index != -1 && !special[index]) {
38                    res += d;
39                    special[index] = true;
40                }
41            }
42        }
43        return res;
44    }
45}