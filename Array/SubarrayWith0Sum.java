public class SubarrayWith0Sum {
    public static void main(String[] args) {
        int arr[]={4, 2, -3, 1, 6};

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==0){
                    System.out.print(true);
                    break;
                }
            }
            
        }
        System.out.print(false);
    }
}
