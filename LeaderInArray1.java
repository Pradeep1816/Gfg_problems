class LeaderInArray1{
    static void solution(int arr[],int n){
        for(int i=0;i<n;i++){
            boolean bool=true; 
            for( int j=i+1;j<n;j++){
                if(arr[i]<=arr[j]){
                    bool=false;
                    break;
                }
            }
            if(bool==true)
              System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{5,6,10,2,7,1};
        int n=arr.length;
        solution(arr,n);
    }
}