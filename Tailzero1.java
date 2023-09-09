class Tailzero1{
    
   static long trailingzero(int n){
        long fact=0;
        int cout=0;
         for(int i=5;i<=n;i=i*5){
           fact=fact+n/i;
        }
        return fact;
    }
    
    public static void main(String[] args) {
        System.out.println("factorial ="+trailingzero(4));
    }
}