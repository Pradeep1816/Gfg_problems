import java.util.HashMap;

public class SmallestKtimes {
   static int findDuplicate(int arr[], int N, int K) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            int p = 0;
            if (map.get(arr[i]) != null) {
                p = map.get(arr[i]);
            }
            map.put(arr[i], p + 1);
        }

        for (int i = 0; i < N; i++) {
            if (map.get(arr[i]) == K) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }

        return min;
    }

    public static void main(String[] args) {
        int arr[]= new int[]{9,5,7,1,3,7,1,8,8};
        int n=arr.length;int k=2;
            System.out.println(findDuplicate(arr,n,k));
    }
}
