import java.util.*;
public class test{
    public static void main(String[] args) {
        long a[]={1,2,3};
        long b[]={1,5,4};
        long n=a.length;
            // Your code goes here
            Arrays.sort(a);
            Arrays.sort(b);
            long s=0;
            int j=(int) ((n)-1);
            for(int i=0;i<=j;i++)
            {
                s+=(a[i]*b[j-i]);
            }
            System.out.println("Sum ="+s);
        }
    }