import java.util.Arrays;

public class MinimizeTheHeight{
    public static void main(String[] args) {
        int k=2;
        int arr[]={1, 5, 8, 10};

    }
    public static int solution(int k, int arr[], int n){
        Arrays.sort(arr);
        if(n==1){
            return 0;
        }
        int diff=arr[n-1]-arr[0];
        int min=0;
        int max=0;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0){
                continue;
            }
            max=Math.max(arr[i-1]+k, arr[n-1]-k);
            min=Math.min(arr[0]+k, arr[i]-k);
            diff=Math.min(diff, max-min);
        }
        return diff;
    }
}