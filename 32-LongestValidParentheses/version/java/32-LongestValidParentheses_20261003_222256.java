// Last updated: 10/3/2026, 10:22:56 PM
1import java.util.*;
2
3class Solution {
4    public int longestValidParentheses(String s) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        stack.push(-1);
9
10        int max = 0;
11
12        for (int i = 0; i < s.length(); i++) {
13
14            if (s.charAt(i) == '(') {
15                stack.push(i);
16            } 
17            else {
18                stack.pop();
19
20                if (stack.isEmpty()) {
21                    stack.push(i);
22                } 
23                else {
24                    int len = i - stack.peek();
25                    max = Math.max(max, len);
26                }
27            }
28        }
29
30        return max;
31    }
32}