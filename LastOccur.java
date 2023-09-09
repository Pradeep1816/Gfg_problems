public class LastOccur {
    static int check(int ar[],int n,int k){
        int ind=-1;
        for(int i=0;i<n;i++){
            if(k==ar[i]){
                ind=i;
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        

        int ar[] =new int[]{1,5,6,1,2,4,2,8,7};
        int n=ar.length;
        System.out.println(check(ar,n,1));

}
}
