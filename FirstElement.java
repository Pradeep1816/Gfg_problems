class FirstElement{
   static int occur(int ar[],int n,int k){
    int value=-1;    
      for(int i=0;i<n;i++){
        int cout=1;
        
        for(int j=i+1;j<n;j++){
            if(ar[i]==ar[j]){
                cout++;
            }
        }
        if(cout==k){
            value=ar[i];
        }
      }
      return value;
         
    }
    public static void main(String[] args) {
        int ar[]= new int[]{1, 7, 4, 3, 4, 8, 7};
        int n=ar.length;
       System.out.println(occur(ar,n, 2));
    }
}