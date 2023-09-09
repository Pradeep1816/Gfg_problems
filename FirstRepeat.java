import java.util.HashSet;

public class FirstRepeat {

 static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashSet<Integer> set= new HashSet<>();
        int min =-1;
        for(int i=n-1;i>=0;i--){
            if(set.contains(arr[i])){
                min=i+1;
            }else{
                set.add(arr[i]);
            }
        }
        return  min;
    }


    public static void main(String[] args) {
         int arr[]= new int[]{9,5,7,3,7,1,8,8};
         int n=arr.length;
        System.out.println(firstRepeated(arr,n));
    }
    
}
