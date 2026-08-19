// Last updated: 8/19/2026, 10:28:00 PM
1class Solution {
2    public int countRangeSum(int[] nums, int lower, int upper) {
3        long[] prefix = new long[nums.length + 1];
4
5        for (int i = 0; i < nums.length; i++) {
6            prefix[i + 1] = prefix[i] + nums[i];
7        }
8
9        return mergeSort(prefix, 0, prefix.length - 1, lower, upper);
10    }
11
12    private int mergeSort(long[] arr, int left, int right,
13                          int lower, int upper) {
14
15        if (left >= right) {
16            return 0;
17        }
18
19        int mid = left + (right - left) / 2;
20
21        int count = 0;
22
23        count += mergeSort(arr, left, mid, lower, upper);
24        count += mergeSort(arr, mid + 1, right, lower, upper);
25
26        int j = mid + 1;
27        int k = mid + 1;
28
29        for (int i = left; i <= mid; i++) {
30
31            while (j <= right && arr[j] - arr[i] < lower) {
32                j++;
33            }
34
35            while (k <= right && arr[k] - arr[i] <= upper) {
36                k++;
37            }
38
39            count += k - j;
40        }
41
42        long[] temp = new long[right - left + 1];
43
44        int i = left;
45        int p = mid + 1;
46        int index = 0;
47
48        while (i <= mid && p <= right) {
49            if (arr[i] <= arr[p]) {
50                temp[index++] = arr[i++];
51            } else {
52                temp[index++] = arr[p++];
53            }
54        }
55
56        while (i <= mid) {
57            temp[index++] = arr[i++];
58        }
59
60        while (p <= right) {
61            temp[index++] = arr[p++];
62        }
63
64        for (int x = 0; x < temp.length; x++) {
65            arr[left + x] = temp[x];
66        }
67
68        return count;
69    }
70}