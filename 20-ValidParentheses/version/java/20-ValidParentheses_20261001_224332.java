// Last updated: 10/1/2026, 10:43:32 PM
1import java.util.*;
2
3class Solution {
4    public boolean isValid(String s) {
5
6        Stack<Character> stack = new Stack<>();
7
8        for (int i = 0; i < s.length(); i++) {
9
10            char ch = s.charAt(i);
11
12            if (ch == '(' || ch == '[' || ch == '{') {
13                stack.push(ch);
14            }
15            else {
16                if (stack.isEmpty()) {
17                    return false;
18                }
19
20                char top = stack.pop();
21
22                if (ch == ')' && top != '(') {
23                    return false;
24                }
25
26                if (ch == ']' && top != '[') {
27                    return false;
28                }
29
30                if (ch == '}' && top != '{') {
31                    return false;
32                }
33            }
34        }
35
36        return stack.isEmpty();
37    }
38}