class Table{
  void showtable(int n){
  for(int i=1;i<=10;i++){
       System.out.println(n+"*"+i+"="+i*n);
       try{
       Thread.sleep(400);
	}catch(Exception e){
		System.out.print(e);
         }
   }
}

}
class MultiThread extends Thread{
      Table t;
      int n;
     MultiThread(Table t){
           this.t=t;
        }

   public void run(){
    t.showtable(5);
   }

}

class MultiThread2 extends Thread{
      Table t;
      int n;
     MultiThread2(Table t){
           this.t=t;

        }

   public void run(){
    t.showtable(10);
   }

}



class Multi{
  public static void main(String []arg){
  Table obj= new Table();
  
  MultiThread m1 = new MultiThread(obj);
  MultiThread2 m2 = new MultiThread2(obj);
  m1.start();
  m2.start();



}
}