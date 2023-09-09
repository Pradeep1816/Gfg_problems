import java.util.*;
class Bool{
    public static void main(String arg[])
    {
        int []arr={1,9,6,3,2,9,1,6,-1,5,10,18,5,-1};
        Boolean[] v=new Boolean[arr.length];
        Arrays.fill(v,false);
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            if(v[i]==true)
            {
                continue;
            }
            else
            {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count+=1;
                    v[j]=true;
               }
            }
            
            if(v[i]!=true)
            {
            System.out.println(arr[i]+"is"+count+" times ");
            }
          }
            
        }
        
    }
}