import java.util.Stack;

public class LeaderInArray {
    static void solution(int arr[],int n){
        Stack<Integer> stk=new Stack<>();
        stk.push(arr[n-1]);
     for(int i=n-2;i>=0;i--){
         if(arr[i]>=stk.peek()){
            stk.push(arr[i]);
         }
       
    }
    while(!stk.isEmpty()){
        System.out.println(stk.pop());
    }
}
public static void main(String[] args) {
    int arr[]=new int[]{16,17,4,3,5,2};
    int n=arr.length;
    solution(arr,n);
}
}
