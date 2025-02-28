public class FindMinimumAndMaximum {
    
    public static void main(String[] args) {
        int arr[]={3,5,2,7,8,3,24,6,15,64,23,67};
        int ans[]=minAndMax(arr);
        System.out.println("Min: "+ans[0]);
        System.out.println("Max: "+ans[1]);
    }
    public static int[] minAndMax (int arr[]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        int ans[]=new int[2];
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}
