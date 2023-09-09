abstract class Matrix{
 abstract void transpose(int arr[][],int trans[][]);
 //abstract void borderElement();
}
class Calculation extends Matrix{
  void transpose(int arr[][],int trans[][]){
         
         for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[0].length;j++){
               trans[j][i]=arr[i][j];
       }
        }
	
	}
  void print(int trans[][],int arr[][]){
  for(int i=0;i<trans.length;i++){
	    for(int j=0;j<trans[0].length;j++){
               System.out.print(trans[i][j]+" ");
       }
        System.out.println();
        }

       for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[0].length;j++){
               System.out.print(arr[i][j]+" ");
             }
        System.out.println();
        }
	}
}
class Abtrc{
   public static void main(String[] args){
   Calculation cl= new Calculation();
   int arr[][]={{1,8,9},{3,8,2},{9,6,8}};
         int r=arr.length;
         int c=arr[0].length;
         int trans[][]= new int[r][c];
	
       
     
    cl.transpose(arr,trans);
    cl.print(trans,arr);
}
}