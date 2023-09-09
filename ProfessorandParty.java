import java.util.HashMap;

public class ProfessorandParty {

     static void party(long a[],int n){

        HashMap<Long,Long> map= new HashMap<>();
        long k=0;
        for(int i=0;i<n;i++){
            
            if(map.get(a[i])!=null){
                k=map.get(a[i]);
            }
                map.put(a[i],k+1);
            if(map.get(a[i])==2){
                System.out.println("Boys");
            }
            
        }
        System.out.println("Girls");
     }



    public static void main(String[] args) {
        long a[]= new long[]{1,5,2,9,3,1};
        int n=a.length;
        party(a,n);

    }
    
}
