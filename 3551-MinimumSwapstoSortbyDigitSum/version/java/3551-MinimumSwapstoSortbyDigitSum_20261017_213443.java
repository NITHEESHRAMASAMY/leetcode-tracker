// Last updated: 10/17/2026, 9:34:43 PM
1
2import java.util.*;
3
4class Solution {
5    public int minSwaps(int[] nums) {
6        int n = nums.length;
7
8        int[][] arr = new int[n][2];
9
10        for (int i = 0; i < n; i++) {
11            arr[i][0] = nums[i];
12            arr[i][1] = digitSum(nums[i]);
13        }
14
15        Arrays.sort(arr, (a, b) -> {
16            if (a[1] != b[1]) {
17                return a[1] - b[1];
18            }
19            return a[0] - b[0];
20        });
21
22        Map<Integer, Integer> index = new HashMap<>();
23
24        for (int i = 0; i < n; i++) {
25            index.put(nums[i], i);
26        }
27
28        boolean[] visited = new boolean[n];
29        int swaps = 0;
30
31        for (int i = 0; i < n; i++) {
32            if (visited[i] || index.get(arr[i][0]) == i) {
33                visited[i] = true;
34                continue;
35            }
36
37            int cycleSize = 0;
38            int j = i;
39
40            while (!visited[j]) {
41                visited[j] = true;
42
43                int value = arr[j][0];
44                j = index.get(value);
45
46                cycleSize++;
47            }
48
49            if (cycleSize > 1) {
50                swaps += cycleSize - 1;
51            }
52        }
53
54        return swaps;
55    }
56
57    private int digitSum(int num) {
58        int sum = 0;
59
60        while (num > 0) {
61            sum += num % 10;
62            num /= 10;
63        }
64
65        return sum;
66    }
67}
68