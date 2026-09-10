// Last updated: 9/10/2026, 10:52:08 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length - 1;
5
6        while (left < right) {
7            int sum = numbers[left] + numbers[right];
8
9            if (sum == target) {
10                return new int[]{left + 1, right + 1};
11            }
12            else if (sum < target) {
13                left++;
14            }
15            else {
16                right--;
17            }
18        }
19
20        return new int[]{-1, -1};
21    }
22}