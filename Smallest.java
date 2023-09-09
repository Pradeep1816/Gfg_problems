
class Smallest {
    public static void main(String[] args) {
      int arr[]= new int[]{1,9,3,6,5,6,1,0};
      int sml=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
          if(arr[i]<sml){
              sml=arr[i];
          }
      }
      
      
      
      int s_sml=Integer.MAX_VALUE;
      for(int i=0;i<arr.length;i++){
          if(arr[i]<s_sml && arr[i]>sml){
              s_sml=arr[i];
          }
      }
      
      
      System.out.print(sml);
    }
}