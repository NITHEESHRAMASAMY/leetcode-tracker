// Last updated: 7/9/2026, 11:49:55 AM
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] arr = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int p = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                p += arr[i + j + 1];

                arr[i + j + 1] = p % 10;
                arr[i + j] += p / 10;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int x : arr) {
            if (sb.length() == 0 && x == 0) continue;
            sb.append(x);
        }

        return sb.toString();
    }
}