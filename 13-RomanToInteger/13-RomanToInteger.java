// Last updated: 7/9/2026, 11:50:01 AM
class Solution {
    public int romanToInt(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int curr = 0;
            if (ch == 'I') {
                curr = 1;
            }
            else if (ch == 'V') {
                curr = 5;
            }
            else if (ch == 'X') {
                curr = 10;
            }
            else if (ch == 'L') {
                curr = 50;
            }
            else if (ch == 'C') {
                curr = 100;
            }
            else if (ch == 'D') {
                curr = 500;
            }
            else if (ch == 'M') {
                curr = 1000;
            }
            if (i < s.length() - 1) {
                char nextCh = s.charAt(i + 1);
                int next = 0;
                if (nextCh == 'I') next = 1;
                else if (nextCh == 'V') next = 5;
                else if (nextCh == 'X') next = 10;
                else if (nextCh == 'L') next = 50;
                else if (nextCh == 'C') next = 100;
                else if (nextCh == 'D') next = 500;
                else if (nextCh == 'M') next = 1000;
                if (curr < next) {
                    c -= curr;
                } else {
                    c += curr;
                }
            } else {
                c += curr;
            }
        }
        return c;
    }
}