// Last updated: 7/9/2026, 11:49:23 AM
class Solution {
    public String clearDigits(String s) {
        s.replaceAll("[0-9]"," ");
   
        while (s.matches(".*[A-Za-z]\\d.*")) {
            s = s.replaceFirst("[A-Za-z]\\d", "");
        }
        return s;
       // return s;
    }
}