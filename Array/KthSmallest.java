import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=3;
        System.out.println(smallest(arr, k));
    }

    public static int smallest(int arr[], int k){
        Arrays.sort(arr);
        int count=0;
        int small=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=small){
                small=arr[i];
                count++;
            }
            if(k==count){
                break;
            }
        }
        return small;
    }
}
