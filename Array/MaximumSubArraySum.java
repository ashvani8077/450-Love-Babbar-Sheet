public class MaximumSubArraySum {
    public static void main(String[] args) {
        int arr[]={2,3,-7,2,1,5};
        System.out.println(maxSum(arr));
    }
    public static int maxSum(int arr[]){
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}
