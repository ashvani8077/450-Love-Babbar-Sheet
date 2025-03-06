public class SortArray012 {
    public static void main(String[] args) {
        int arr[]={0,1,2,0,1,2};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }

    public static void sort(int arr[]){
        int zero=0;
        int one=0;
        int two=0;
        for(int i:arr){
            if(i==0){
                zero++;
            }
            else if(i==1){
                one++;
            }
            else{
                two++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(zero>0){
                arr[i]=0;
                zero--;
            }
            else if(one>0){
                arr[i]=1;
                one--;
            }
            else{
                arr[i]=2;
                two--;
            }
        }
    }
}
