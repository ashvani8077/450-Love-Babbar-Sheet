import java.util.Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {804, 730, 626, 491, 910, 819, 191, 968, 929, 254, 778}; 
        int arr2[] = {273, 452, 639, 144, 410, 773, 754, 549, 809, 538}; 

        System.out.println(union(arr1, arr2)); // Function Call
    }

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer>hs=new HashSet<>();
        for(int i:arr1){
            hs.add(i);
        }
        for(int j:arr2){
            hs.add(j);
        }
        return hs.size();
    }
}
