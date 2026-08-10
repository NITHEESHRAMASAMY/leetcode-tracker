// Last updated: 8/10/2026, 2:14:53 PM
1class Solution {
2    public String reverseVowels(String s) {
3      char arr[]=s.toCharArray();
4      int a=0;
5      int b=arr.length-1;
6      while(a<b){
7      while(a<b && !(arr[a] == 'a' || arr[a] == 'e' ||
8                     arr[a] == 'i' || arr[a] == 'o' ||
9                     arr[a] == 'u' || arr[a] == 'A' ||
10                     arr[a] == 'E' || arr[a] == 'I' ||
11                     arr[a] == 'O' || arr[a] == 'U')){
12                        a++;
13                     } 
14        while(a<b && !(arr[b]== 'a' || arr[b] == 'e' ||
15                     arr[b] == 'i' || arr[b] == 'o' ||
16                     arr[b] == 'u' || arr[b] == 'A' ||
17                     arr[b] == 'E' || arr[b] == 'I' ||
18                     arr[b] == 'O' || arr[b] == 'U')){
19                        b--;
20                     }  
21                     char temp=arr[a];
22                     arr[a]=arr[b];
23                     arr[b]=temp;   
24                     a++;
25                     b--;
26      }
27      return new String(arr);        
28    }
29}