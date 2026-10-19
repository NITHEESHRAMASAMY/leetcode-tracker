// Last updated: 10/19/2026, 10:05:34 PM
1
2class Solution {
3    public List<Integer> targetIndices(int[] nums, int target) {
4        Arrays.sort(nums);
5
6        List<Integer> ans = new ArrayList<>();
7
8        for (int i = 0; i < nums.length; i++) {
9            if (nums[i] == target) {
10                ans.add(i);
11            }
12        }
13
14        return ans;
15    }
16}
17