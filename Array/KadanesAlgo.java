class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int sum=arr[0];
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=sum+arr[i];
            ans=Math.max(sum,ans);
            
        }
        return ans;
    }
}