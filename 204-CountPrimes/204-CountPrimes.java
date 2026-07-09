// Last updated: 7/9/2026, 11:49:42 AM
// class Solution {
//     public int countPrimes(int n) {
//      //   boolean pri=true;
//         int c=0;
//         if(n<=2) return 0;
//          else{
//             for(int i=2;i<n;i++){
//                   boolean pri=true;
//                   for(int j=2;j<=Math.sqrt(i);j++){
//                 if(i%j==0){
//                     pri=false;
//                     break;
//                 }  
//             }
//             if(pri){
//                 c++;
//             }
//          }
//     }
//     return c;
// }
// }
class Solution {
    public int countPrimes(int n) {

        if (n <= 2)
            return 0;

        boolean[] notPrime = new boolean[n];

        int count = 0;

        for (int i = 2; i < n; i++) {

            if (!notPrime[i]) {

                count++;

                if ((long)i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        notPrime[j] = true;
                    }
                }
            }
        }

        return count;
    }
}