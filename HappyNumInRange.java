public class HappyNumInRange {
    static void isHappy(int x,int y){
        
           for(int i=x;i<=y;i++){
                int n=i;
                int sum=i;
                while(sum>9){
                    sum=0;
                      while(n>0){
                        int d=n%10;
                        sum+=d*d;
                        n/=10;
                      }
                      n=sum;
                }
            if(sum==1){
            System.out.println("happy"+i);
           }
           }
           
    }
    public static void main(String[] args) {
        int n1=1;
        int n2=100;
        isHappy(n1, n2);
    }
}
