class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int i=0;i<arr.length;i++){
            StringBuilder sb=new StringBuilder(String.valueOf(arr[i]));
            String or=sb.toString();
            String re=sb.reverse().toString();
            if(!or.equals(re)){
                return false;
            }
        }
        return true;
    }
}