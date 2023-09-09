import java.util.*;
class Book{
    private String book_title;
    private String isbn_no;
    private int price;
    private String auther_name;
    Scanner sc= new Scanner(System.in);
    public void get_details(){
        System.out.print("Enter Book name :");
        book_title =sc.nextLine();
        System.out.print("Enter ISBN Number :");
        isbn_no=sc.nextLine();
        System.out.print("Enter book price :");
        price=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter auther_name :");
        auther_name=sc.nextLine();
    }
    public void display(){
      System.out.println("-----------------------Book Details-----------------");
      System.out.println(" Book name :"+book_title);
      System.out.println("ISBN NUMBER :"+isbn_no);
      System.out.println("Book Price:"+price);
      System.out.println("Auther Name:"+ auther_name);
      System.out.println();
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
        System.out.print("Enter number of n Books details :");
        int n=sc.nextInt();
	Book ac[] = new Book[n];
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