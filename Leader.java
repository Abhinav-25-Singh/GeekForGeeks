/*Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. 

Example 1:

Input:
n = 6
A[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: The first leader is 17 
as it is greater than all the elements
to its right.  Similarly, the next 
leader is 5. The right most element 
is always a leader so it is also 
included. */


import java.util.*;
public class Leader{
        //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> a=new ArrayList<Integer>();
        //adding rightmost element
        a.add(arr[n-1]);
        //store max value from right
        int max=arr[n-1];
        //loop to traverse and find leader element
        for(int i=n-2;i>=0;i--)
        {
            //adding leader elements
            if(arr[i]>=max)
            {
            a.add(arr[i]);
            max=arr[i];
            }
        }
        //reverse the leader list 
        Collections.reverse(a);
        return(a);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        //input size of array
        int n=ob.nextInt();
        //intializing array
        int[] a=new int[n];
        //input elements in the array
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter value "+(i+1));
            a[i]=ob.nextInt();
        }
        //printing the leader list
        System.out.println(leaders(a, n));
    }
}