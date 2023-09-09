class Sumnatural1{

   int sum(int n){
       return n*(n+1)/2;
  }


public static void main(String[] arg){
      Sumnatural1 s= new Sumnatural1();
     int p=s.sum(5);
	System.out.print(p);
}

}