import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int arr[]={2, 6, 1, 9, 4, 5, 3};
        Arrays.sort(arr);
        int ans=0;
        int count=1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (arr[i] == arr[i - 1] + 1) {
                    count++;
                } else {
                    ans = Math.max(ans, count);
                    count = 1;
                }
            }
        }
        System.out.println(Math.max(ans, count));
    }
}
