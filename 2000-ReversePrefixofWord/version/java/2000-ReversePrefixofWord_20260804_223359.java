// Last updated: 8/4/2026, 10:33:59 PM
1class Solution {
2    public String reversePrefix(String word, char ch) {
3        for (int i = 0; i < word.length(); i++) {
4            char ch1 = word.charAt(i);
5
6            if (ch == ch1) {
7                char[] arr = word.toCharArray();
8
9                int left = 0;
10                int right = i;
11
12                while (left < right) {
13                    char temp = arr[left];
14                    arr[left] = arr[right];
15                    arr[right] = temp;
16
17                    left++;
18                    right--;
19                }
20
21                return new String(arr);
22            }
23        }
24
25        return word;
26    }
27}