import java.util.ArrayList;

public class PairWith0Sum {
    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==0&&i!=j){
                    ArrayList<Integer>li=new ArrayList<>();
                    li.add(arr[i]);
                    li.add(arr[j]);
                    ans.add(li);
                }
            }
        }
    }
}
