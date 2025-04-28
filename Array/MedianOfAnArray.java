class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        int n=arr.length;
        int mid=n+1/2;
        if(n%2!=0){
            return (double)arr[mid];
        }
        return (arr[mid]+arr[mid-1])/2.0;
    }
}
