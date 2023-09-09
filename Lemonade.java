class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int five=0,ten=0,twenty=0;
        for(int i=0;i<N;i++){
        if(bills[i]==5){
            five++;
        }else if(bills[i]==10){
            ten++;
            if(five>0){
                five--;
            }else{
                return false;
            }
        }
        else{
            twenty++;
            if(ten>0 && five>0){
                ten--;
                five--;
            }else if(five>2){
                five=five-3;
            }else{
                return false;
            }
        }
        
      }
      return true;
    }
}
class Lemonade{
  public static void main(String[] arg){
   Solution s= new Solution();
    int arr[]=new int[]{5,5,10,10,20};
    boolean bool;
    bool=s.lemonadeChange(arr.length,arr);
    System.out.print(bool);
 }

}
