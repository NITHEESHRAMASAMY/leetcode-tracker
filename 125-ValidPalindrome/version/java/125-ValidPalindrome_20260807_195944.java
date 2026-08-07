// Last updated: 8/7/2026, 7:59:44 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.toLowerCase();
4       // s=Character.isLetter(s);
5       String s1="";
6        for(int i=0;i<s.length();i++){
7              char ch=s.charAt(i);
8              if(Character.isLetterOrDigit(ch)){
9                s1+=ch;
10              }
11        }
12        String s2="";
13        for(int i=s1.length()-1;i>=0;i--){
14            char ch1=s1.charAt(i);
15            s2+=ch1;
16        }
17        if(s1.equals(s2)){
18            return true;
19        }
20        else{
21            return false;
22        }
23       // return false;
24    }
25}