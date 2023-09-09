class Gcd{
   static int gcd(int a,int b){
        int res=0;
        res=Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0)
            {
                break;
            }
            res--;
        }
        return res;
    }
    
    public static void main(String[] arg){
        System.out.print(" min number"+gcd(10,20));
    }
}
