// Last updated: 9/22/2026, 11:46:46 PM
1
2class Solution {
3    public int[] resultArray(int[] nums) {
4
5        List<Integer> arr1 = new ArrayList<>();
6        List<Integer> arr2 = new ArrayList<>();
7
8        arr1.add(nums[0]);
9        arr2.add(nums[1]);
10
11        for (int i = 2; i < nums.length; i++) {
12
13            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
14                arr1.add(nums[i]);
15            } else {
16                arr2.add(nums[i]);
17            }
18        }
19
20        int[] result = new int[nums.length];
21        int index = 0;
22
23        for (int x : arr1) {
24            result[index++] = x;
25        }
26
27        for (int x : arr2) {
28            result[index++] = x;
29        }
30
31        return result;
32    }
33}