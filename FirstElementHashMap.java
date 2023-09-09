import java.util.HashMap;

public class FirstElementHashMap {
    static int occur(int ar[],int n,int k){
        
        HashMap<Integer,Integer> map= new HashMap<>();

       for (int i = 0; i < n; i++) {
            int a=0;
           if(map.get(ar[i])!=null){
                    a=map.get(ar[i]);
           }
            map.put(ar[i],a+1);
            // if(map.get(ar[i])==k){
            //     return ar[i];
            // }
        }
        for(int i=0;i<n;i++){
            if(map.get(ar[i])==k){
                return ar[i];
            }
        }
        
      

          return -1;
             
        }
        public static void main(String[] args) {
            int ar[]= new int[]{1, 7, 4, 3, 4, 8, 7};
            int n=ar.length;
           System.out.println(occur(ar,n, 2));
        }
}
