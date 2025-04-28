class Solution {
    public double medianOf2(int a[], int b[]) {
        // Your Code Here
        int arr[]=new int[a.length+b.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            arr[k]=a[i];
            k++;
        }
        for(int i=0;i<b.length;i++){
            arr[k]=b[i];
            k++;
        }
        Arrays.sort(arr);
        int n=arr.length;
        int mid=n/2;
        if(n%2!=0){
            return (double)arr[mid];
        }
        return (arr[mid]+arr[mid-1])/2.0;
    }
}