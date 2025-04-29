public class MaximumProductSubarray {
    public static void main(String[] args) {
        int arr[] = {-2, 6, -3, -10, 0, 2};
        int maxProduct = arr[0];
        int currMax = arr[0];
        int currMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int temp = currMax;
            
            currMax = Math.max(arr[i], Math.max(currMax * arr[i], currMin * arr[i]));
            currMin = Math.min(arr[i], Math.min(temp * arr[i], currMin * arr[i]));

            maxProduct = Math.max(maxProduct, currMax);
        }

        System.out.println(maxProduct);
    }
}
