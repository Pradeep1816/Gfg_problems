
class Trailzero2 {
    
   static long trailingzero(int n){
        long fact=1;
        int cout=0;
         for(int i=2;i<=n;i++){
           fact=fact*i;
        }
        while(fact>0){
            if(fact%10==0){
                cout++;
            }
            fact/=10;
        }
        return cout;
    }
    
    public static void main(String[] args) {
        System.out.println("factorial ="+trailingzero(17));
    }
}