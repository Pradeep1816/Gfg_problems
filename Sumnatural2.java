class Sumnatural2{

   void sum(int n){
     int sum=0;
      for(int i=1;i<=n;i++){
		sum+=i;
     }
     System.out.print(sum);
  }


public static void main(String[] arg){
      Sumnatural2 s= new Sumnatural2();
      s.sum(5);
}

}