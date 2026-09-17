// Last updated: 9/17/2026, 10:45:16 PM
1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3        int n = arr.length;
4        int[] best = new int[n];
5        
6        int left = 0;
7        int sum = 0;
8        int minLen = Integer.MAX_VALUE;
9        int ans = Integer.MAX_VALUE;
10
11        for (int right = 0; right < n; right++) {
12            sum += arr[right];
13
14            while (sum > target) {
15                sum -= arr[left];
16                left++;
17            }
18
19            if (sum == target) {
20                int len = right - left + 1;
21
22                // Best subarray completely before this one
23                if (left > 0 && best[left - 1] != Integer.MAX_VALUE) {
24                    ans = Math.min(ans, len + best[left - 1]);
25                }
26
27                minLen = Math.min(minLen, len);
28            }
29
30            // Store the best subarray up to this index
31            best[right] = minLen;
32        }
33
34        return ans == Integer.MAX_VALUE ? -1 : ans;
35    }
36}