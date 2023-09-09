import java.util.Stack;

class Countpairswithgivensum{

    static void solution(int arr[],int n,int sum){
       int cout=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]+arr[j]==sum){
                cout++;
            }
        }
       }
       System.out.println(cout);
  }
public static void main(String[] args) {
    int arr[]=new int[]{16,7,4,3,5,0,2};
    int n=arr.length;
    solution(arr,n,7);
}
}