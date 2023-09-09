import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DublicateEle {
    static void Dublicate(int arr[]){
            int [] k = new int[arr.length];
            k[0]=arr[0];
            int m =1;
            for(int i=1;i<arr.length;++i){
                if(arr[i]!=arr[i-1]){
                    k[m]=arr[i];
                    ++m;
                }
            }
          for(int i=0;i<m;i++){
            System.out.println(k[i]);
          }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{1,9,6,1,2,8,1,4,3,2};
            Dublicate(arr);
    }
}
