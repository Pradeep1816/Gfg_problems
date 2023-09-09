public class Productarraypuzzle {
    static void solution(int arr[],int n){
            int l[]=new int[n];
            int r[]=new int[n];
            int pro[]=new int[n];
            l[0]=1;
            r[n-1]=1;
            for(int i=1;i<n;i++){
                l[i]=arr[i-1]*l[i-1];
            }
            
            for(int i=n-2;i>=0;i--){
                r[i]=arr[i+1]*r[i+1];
            }
            for(int i=0;i<n;i++){
                System.out.println(r[i]+"  "+l[i]);
            }
        }
    public static void main(String[] args) {
        
        int arr[]=new int[]{10,3,5,6,2};
        int n=arr.length;
        solution(arr,n);
    }
    
}
