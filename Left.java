class Left{
    public static void main(String[] arg){
        int arr[]= new int[]{1,2,3,4,5};
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int j=0;j<arr.length-1;j++){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}