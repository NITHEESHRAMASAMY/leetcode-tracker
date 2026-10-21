// Last updated: 10/21/2026, 10:44:30 PM
1import java.util.*;
2
3class Solution {
4    public int minOperations(String s) {
5        int n = s.length();
6        if (IntStream.range(1, n).allMatch(i -> s.charAt(i - 1) <= s.charAt(i))) return 0;  // already sorted
7        if (n == 2) return -1;  // only single letters can be sorted, which changes nothing
8        IntSummaryStatistics mid = s.chars().skip(1).limit(n - 2).summaryStatistics();  // the middle's smallest and largest letters
9        int first = s.charAt(0), last = s.charAt(n - 1), lo = mid.getMin(), hi = mid.getMax();
10        if (first <= Math.min(lo, last) || Math.max(first, hi) <= last) return 1;  // the first letter is the smallest, or the last the largest
11        return last < lo && hi < first ? 3 : 2;  // the middle sits strictly between the last letter and the first
12    }
13}