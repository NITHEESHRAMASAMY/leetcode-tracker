// Last updated: 7/27/2026, 4:25:42 PM
1class Solution {
2    public boolean checkIfPangram(String sentence) {
3       // if(sentence.length()!=26)
4       //     return false;
5        boolean arr[]=new boolean[26];
6        for(int i=0;i<sentence.length();i++){
7            char ch=sentence.charAt(i);
8            if(ch>='a' && ch<='z'){
9              arr[ch-'a']=true;
10            }
11        }
12              boolean flag=true;
13              for(int i=0;i<26;i++){
14                if(!arr[i]){
15                    flag=false;
16                    break;
17                }
18              }
19           // return true;
20        return flag;
21    }
22}