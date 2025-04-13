import java.util.*;
public class FindCommonElementInSortedArray {
    public static void main(String[] args) {
        
    }
    public static List common(List<Integer>arr1, List<Integer>arr2, List<Integer>arr3){
        List <Integer>ans=new ArrayList<>();
        HashSet<Integer>hs1=new HashSet<>(arr1);
        HashSet<Integer>hs2=new HashSet<>(arr2);
        HashSet<Integer>hs3=new HashSet<>(arr3);
        for(Integer num:hs1){
            if(hs2.contains(num)&&hs3.contains(num)){
                ans.add(num);
            }
        }
        Collections.sort(ans);
        
        return ans;
    }
}
