public class AlternativePositiveNegative {
    public static void main(String[] args) {
        int arr[]={9, 4, -2, -1, 5, 0, -5, -3, 2};
        int n = arr.length;
        int pos = 0;
        int neg = 1;
        
        while (pos < n && neg < n) {
            while (pos < n && arr[pos] >= 0) {
                pos += 2;
            }
            while (neg < n && arr[neg] < 0) {
                neg += 2;
            }
            
            if (pos < n && neg < n) {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
        }
    }
}
