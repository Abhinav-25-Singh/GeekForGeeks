import java.util.*;
public class equalarray {
    static long[] sort(long a[])
    {
        Arrays.sort(a);
        return a;
    }
    
    public static boolean Equal(long a[],long b[]) {
    if(a.length!=b.length)
    return false;
    sort(a);
    sort(b);
    int z=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==b[i])
        continue;
        else{
        z=1;
        break;
        }
    }
    if(z==1)
    return false;
    else
    return true;
    }
    public static void main(String[] args) {
    long a[]={1,2,5,4,0};
    long b[]={2,4,5,0,1};
    if(Equal(a,b)==false)
    System.out.println("The two arrays are not equal");
    else
    System.out.println("The two arrays are equal");
    }
}
