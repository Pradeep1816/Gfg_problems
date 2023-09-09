class Solutiongcd3{
   static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
    public static void main(String[] arg){
        System.out.print("greatest gcd "+gcd(10,15));
}
}
