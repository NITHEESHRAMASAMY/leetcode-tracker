// Last updated: 9/25/2026, 9:58:24 PM
1import java.util.*;
2
3class Solution {
4
5    int index = 0;
6
7    public List<String> braceExpansionII(String expression) {
8        Set<String> result = parse(expression);
9
10        List<String> ans = new ArrayList<>(result);
11        Collections.sort(ans);
12
13        return ans;
14    }
15
16    Set<String> parse(String s) {
17
18        Set<String> result = new HashSet<>();
19        Set<String> current = new HashSet<>();
20
21        current.add("");
22
23        while (index < s.length() && s.charAt(index) != '}') {
24
25            char ch = s.charAt(index);
26
27            // Comma means union
28            if (ch == ',') {
29                result.addAll(current);
30                current.clear();
31                current.add("");
32                index++;
33            }
34
35            // Braces
36            else if (ch == '{') {
37                index++; // skip '{'
38
39                Set<String> inside = parse(s);
40
41                index++; // skip '}'
42
43                current = combine(current, inside);
44            }
45
46            // Normal letter
47            else {
48                Set<String> letter = new HashSet<>();
49
50                letter.add(String.valueOf(ch));
51
52                current = combine(current, letter);
53
54                index++;
55            }
56        }
57
58        result.addAll(current);
59
60        return result;
61    }
62
63    Set<String> combine(Set<String> a, Set<String> b) {
64
65        Set<String> result = new HashSet<>();
66
67        for (String x : a) {
68            for (String y : b) {
69                result.add(x + y);
70            }
71        }
72
73        return result;
74    }
75}