// Last updated: 9/26/2026, 10:48:27 PM
1import java.util.*;
2
3class Solution {
4    public String evaluate(String s, List<List<String>> knowledge) {
5        
6        HashMap<String, String> map = new HashMap<>();
7
8        // Store knowledge in HashMap
9        for (List<String> x : knowledge) {
10            map.put(x.get(0), x.get(1));
11        }
12
13        StringBuilder ans = new StringBuilder();
14
15        int i = 0;
16
17        while (i < s.length()) {
18
19            if (s.charAt(i) == '(') {
20
21                int j = i + 1;
22
23                // Find closing bracket
24                while (s.charAt(j) != ')') {
25                    j++;
26                }
27
28                // Extract key
29                String key = s.substring(i + 1, j);
30
31                // Check if key exists
32                if (map.containsKey(key)) {
33                    ans.append(map.get(key));
34                } else {
35                    ans.append("?");
36                }
37
38                // Move after ')'
39                i = j + 1;
40
41            } else {
42                ans.append(s.charAt(i));
43                i++;
44            }
45        }
46
47        return ans.toString();
48    }
49}