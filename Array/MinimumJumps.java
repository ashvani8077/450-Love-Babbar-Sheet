public class MinimumJumps {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int n=arr.length;
        int cap=arr[0];
        if(cap<=0){
            System.out.print(0);
        }
        int jump=0;
        int i=0;
        while (i<n) {
            jump++;
            if(i+cap>=n){
                break;
            }
            int maxReach=0;
            int nextIndex=i;
            for(int j=i+1;j<=i+cap;j++){
                if(j+arr[j]>maxReach){
                    maxReach=j+arr[j];
                    nextIndex=j;
                }
            }
            i=nextIndex;
            cap=arr[i];
        }
        System.out.print(jump);
    }
}
