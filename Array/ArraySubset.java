import java.util.*;
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<a.length;i++){
            mp.put(a[i],mp.getOrDefault(a[i],0)+1);
        }
        for(int i:b){
            if(!mp.containsKey(i)||mp.get(i)<=0){
                return false;
            }
            mp.put(i, mp.get(i) - 1);
        }
        return true;
    }
}
