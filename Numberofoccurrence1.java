public class Numberofoccurrence1 {
    static int occurrence(int arr[],int n,int k){
            int count=0;
            for(int i=0;i<n;i++){
                  if(arr[i]==k){
                    count++;
                  }
            }
            if(count==0){
                return -1;
            }
            return count;
    }
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,7,7,7,8,8,8,8,8,9};
        int n=arr.length;
        int k=1;
        System.out.println(occurrence(arr,n,k));
    }
}
