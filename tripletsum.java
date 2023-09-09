class Solution
{
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        int sum=0;
        boolean get=false;
        for(int i=0;i<n;i++){
           
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        get=true;
                    }
                }
            }
        }
        if(get!=false){
            return true;
        }
        return false;
    }
}