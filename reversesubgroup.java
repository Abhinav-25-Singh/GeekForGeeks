/*Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5. */

import java.util.*;
public class reversesubgroup {
    static void ReverseSubGroups(ArrayList<Integer> arr, int n, int k) 
    {
        //traversing through array list
        for(int i=0;i<n;i+=k)
        {
            // storing left index in L
            int l=i;
            //Right index stored in r
            //Math function min is used in case when k is not a multiple of n then remaining elements of the list must be reversed so the lesser value is used as right index
            int r=Math.min(i+k-1,n-1);
            //temp variable to swap values
            int x;
            //loop to reverse the sub array
            while(l<r)
            {
                x=arr.get(l);
                arr.set(l,arr.get(r));
                arr.set(r,x);
                l++;r--;
            }
        }
        //Printing modified arraylist
        System.out.println(arr);
    }
    public static void main(String[] args) {
    Scanner ob=new Scanner(System.in);
    try{
    //ArrayListCreation
    ArrayList<Integer> arr=new ArrayList<Integer>();
    System.out.println("Enter number of elements to be added in the Arraylist");
    int n=ob.nextInt();
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter value "+(i+1));
        int a=ob.nextInt();
        arr.add(a);
    }
    //Inputting subgroup size
    System.out.println("Enter sub group size");
    int k=ob.nextInt();
    //Function call
    ReverseSubGroups(arr, n, k);
    }
    finally{
        ob.close();
    }
}
}

