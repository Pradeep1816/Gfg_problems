class Solutiongcd2{
    public static void main(String[] arg){
        int a=10;int b=15;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        System.out.print(" min number"+a);
    }
}
