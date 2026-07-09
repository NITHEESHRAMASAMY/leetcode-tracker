// Last updated: 7/9/2026, 11:49:52 AM
class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res=new ArrayList<>();
        if(arr.length==0){
            return res;
        }
        int top=0,bottom=arr.length-1;
        int left=0,right=arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                res.add(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(arr[bottom][i]);
                }
                bottom--;  
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(arr[i][left]);
                }
             left++;
            }
        }
        return res;
    }
}