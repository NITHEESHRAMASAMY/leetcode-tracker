// Last updated: 10/22/2026, 9:44:01 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int n = nums.length, shift = 0;
4        while (nums[shift] != 0) shift++;
5
6        boolean along = true, against = true;
7        for (int k = 0; k < n && (along || against); k++) {
8            int ring = nums[(shift + k) % n];  // the circle, read from 0
9            along &= ring == k;  // counts up along the arrow
10            against &= ring == (n - k) % n;  // counts up against the arrow
11        }
12        if (along) return Math.min(shift, n - shift + 2);  // walk ahead, or turn, walk back, turn back
13        if (against) return Math.min(shift + 2, n - shift);  // walk ahead and turn, or turn and walk back
14        return -1;
15    }
16}