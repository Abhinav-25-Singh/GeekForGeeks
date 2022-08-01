/*Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different though.
Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
Example 1:

Input:
N = 5
A[] = {1,2,5,4,0}
B[] = {2,4,5,0,1}
Output: 1
Explanation: Both the array can be 
rearranged to {0,1,2,4,5} 
*/

import java.util.*;
public class equalarray {
    //method to sort array
    static long[] sort(long a[])
    {
        Arrays.sort(a);
        return a;
    }
    //method to check equality of array
    public static boolean Equal(long a[],long b[]) {
    //Check the equality of length
    if(a.length!=b.length)
    return false;
    //sorting the two arrays using sort method created
    sort(a);
    sort(b);
    //check variable
    int z=0;
    //loop to traverse through the 2 arrays and check elements equality
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==b[i])
        continue;
        else{
        z=1;
        break;
        }
    }
    //if check variable updated it means mismatch in elements 
    if(z==1)
    return false;
    else
    return true;
    }

    //main method to invoke the functions
    public static void main(String[] args) {
    long a[]={1,2,5,4,0};
    long b[]={2,4,5,0,1};
    //if false then print the message and if true the other message is printed
    if(Equal(a,b)==false)
    System.out.println("The two arrays are not equal");
    else
    System.out.println("The two arrays are equal");
    }
}
