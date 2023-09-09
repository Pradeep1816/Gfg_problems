import java.util.*;
class Account{
    private String name;
    private long accno;
    private String branch;
    private String acc_type;
    private long balance;
    Scanner sc= new Scanner(System.in);
    public void get_details(){
        System.out.print("Enter Acc_holder name :");
        name=sc.nextLine();
        System.out.print("Enter Account No. :");
        accno=sc.nextLong();
        System.out.print("Enter branch name:");
        branch=sc.nextLine();
        sc.nextLine();
        System.out.print("Enter Account Type :");
        acc_type=sc.nextLine();
        System.out.print("Enter Deposit Balance :");
        balance=sc.nextLong();
    }
    public void display(){
      System.out.println("-----------------------Account Holder Details-----------------");
      System.out.println("Acc_holder name:"+name);
      System.out.println("Account No. :"+accno);
      System.out.println("Branch Name :"+branch);
      System.out.println("Account Type :"+ acc_type);
      System.out.println("Balance :"+balance);
      System.out.println();
    }
  public void deposit(){
    long amount;
    System.out.print("Enter Deposit Amount :");
    amount=sc.nextLong();
    balance=balance+amount;
    System.out.println("######################################################");
    System.out.println("After Depoist Balance is :"+balance);
    System.out.println("######################################################");
}
  public void withdraw(){
  long amnt;
 System.out.print("Enter withdraw Amount :");
 amnt=sc.nextLong();
if(balance>=amnt){
    balance=balance-amnt;
    System.out.print("Balance After withdrawing :"+balance);
}
else{
System.out.print("Failed to Transaction!! -- Incufficent Balance");
}
}
        boolean fetch(long acc){
	     if(accno==acc){
		return true;
          }else{
              return false;
         }          
	}
}
																													
class  Bank{
    public static void main (String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of customer for open account :");
        int n=sc.nextInt();
	Account ac[] = new Account[n];
         int choice;
      do{
         System.out.print("-------MENU OPERATION-----\n\n1.OPENT ACCOUNT\n2.SHOW ACCOUNT DETAILS\n3.SEARCH ACCOUNT\n4.DEPOSIT\n5.WITHDRAW\n5.Exit\n     \n\n6.ENTER YOUR CHOICE :");
	choice=sc.nextInt();
    switch(choice){
	case 1:
	for(int i=0;i<ac.length;i++){
         ac[i]= new Account();
          System.out.println("Enter detail of customer "+(i+1));
          System.out.println();
          ac[i].get_details();
       }
     break;
	case 2:
	for(int i=0;i<ac.length;i++){
	ac[i].display();
        }
	break;
	case 3:
	System.out.print("Enter Account No. TO search :");
        long acc=sc.nextLong();
        boolean got=false;
       for(int j=0;j<ac.length;j++){
	   got=ac[j].fetch(acc);
	   if(got){
            ac[j].display();
            }
          else{
	System.out.print("don't have Account.");
	}
	}
    

  }//switch
  }while(choice!=2);
       
}
}