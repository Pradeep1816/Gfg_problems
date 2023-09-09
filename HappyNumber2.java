public class HappyNumber2 {
    static boolean isHappyNumber(int n){
        if(n==1){
            return true;
        }
        int sum=n;int x=n;
        while(sum>9){
            sum=0;
             while(x>0){
                int d=x%10;
                sum+=d*d;
                x=x/10;
             }
             if(sum==1){
                return true;
             }
             x=sum;
        }
       if(sum==1){
        return true;
       }
       return false;

    }
    public static void main(String[] args) {
        if(isHappyNumber(68)){
            System.out.println("Happy");
        }else{
            System.out.println("Unhappy");
        }
    }
}
