class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        String s="No";
        for(int i=0;i<(int)m;i++){
            if(match(a2[i],a1)==true){
                 s="Yes";
            }else{
                return "No";
            }
        }
        return s;
        
    }
    boolean match(long n,long a1[]){
        int flag=0;
        for(int i=0;i<(int)a1.length;i++){
             if(a1[i]==n){
                 a1[i]=-1;
                 flag=1;
                 break;
             }
        }
        if(flag==1){
            return true;
        }
        return false;
    }
}