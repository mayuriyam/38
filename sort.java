import java.io.*;
import java.util.*;
class sort
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner (System.in);
        //int sum=0;
        String a=sc.next();
        int b[]=new int[a.length()];
        for(int i=0;i<a.length();i++)
        {
            b[i]=Integer.parseInt(String.valueOf(a.charAt(i)));
        }
       
       Arrays.sort(b);
       System.out.println(b[a.length()-1]);
    }
}
