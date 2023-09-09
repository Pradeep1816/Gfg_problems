import java.util.ArrayList;

class AlmostPrime{
      void prime(int n){
        ArrayList<Integer> al= new ArrayList<>(); 
        for(int i=1;i<=n;i++){
            if(isprime(i)){
             al.add(i);
            }
        }
        System.out.println(al);
     }


 boolean isprime(int k){
            
          for(int i=2;i<=k/2;i++){
            
            if(k%i==0){
              return false;
            }
          }
          return true;
        }

    public static void main(String[] args) {
        int n=10;
        AlmostPrime ap= new AlmostPrime();
        ap.prime(n);
    }
}