public class SmallestSubarray {
    public static void main(String[] args) {
        int x=51;
        int arr[]={1, 4, 45, 6, 0, 19};
        int minLength=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            if(sum>=x){
                System.out.println(1);
            }
            for(int j=0;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>=x){
                    minLength=Math.min(minLength, j-i+1);
                    break;
                }
            }
        }
     //   return minLength===Integer.MAX_VALUE?0:minLength;
    }
}
