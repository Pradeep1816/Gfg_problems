class Sumnatural3{

   void sum(int n){
     int sum=0;
      for(int i=1;i<=n;i++){
	for(int j=1;j<=i;j++){
		sum++;
       }	
     }
     System.out.print(sum);
  }


public static void main(String[] arg){
      Sumnatural2 s= new Sumnatural2();
      s.sum(5);
}

}