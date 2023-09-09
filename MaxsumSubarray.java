public class MaxsumSubarray {
    static void maxSubarraysum(int arr[]){
        int n=arr.length;
       long max_sum=Integer.MIN_VALUE;
       long sum=0;
       for(int i=0;i<n;i++){
            sum+=arr[i];
            if(max_sum<sum){
                max_sum=sum;
            }
            if(sum<0){
                sum=0;
            }
       }
       System.out.println(max_sum);


    }
    public static void main(String[] args) {
        int arr[]=new int[]{-1,-2,-3,-4,-5,};
            maxSubarraysum(arr);
    }
}
