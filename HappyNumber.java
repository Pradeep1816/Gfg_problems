import java.util.Scanner;

public class HappyNumber {
    static int check(int n){
         int sum=0;
         while(n!=0){
              int d=n%10;
              sum+=d*d;
              n=n/10;
         }
         return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number for Happy Number");
        int n=sc.nextInt();
        int temp=n;
        while(temp>9){
           temp=check(temp);
        }
        if(temp==1){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not Happy");
        }
    }
}
