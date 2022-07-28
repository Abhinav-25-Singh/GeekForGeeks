/*Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.

In case of multiple subarrays, return the subarray which comes first on moving from left to right 
Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.*/

import java.util.*;
public class subarraysum
{
    //Main method to execute the function Subarraysum
    public static void main(String[] args)
    {   
        Scanner ob = new Scanner(System.in);
        try
        {
        int[] arr={1,2,3,4,6};
        int n=arr.length;
        System.out.println("Enter number ");
        int s=ob.nextInt();
        subarraysum obj=new subarraysum();
        obj.Subarraysum(arr,n,s);
        }
        finally
        {
        ob.close();
        }
    }
//Function to find the index range of sub array sum
public int Subarraysum(int arr[],int n,int s)
{
    //loop to iterate through the array
    for(int i=0;i<n;i++)
    {
        //variable sum to store the sum of array elements 
        int sum=arr[i];
        for(int j=i+1;j<n;j++)
        {
            //check if the sum of elements is equal to the number to be checked
            if(sum==s)
            {
                //Printing the Index range
                System.out.println("Sum of elements from position "+(i+1)+" to "+(j)+" is "+s);
                return 1;
            }
            //Checking if sum is greater than number to checked or if traversal has reached the last element of array then terminate the loop
            if(sum>s||j==n-1)
            break;
            sum+=arr[j];
        }
    }
    //Error message if no sum found
    System.out.println("No subarray found");
    return 0;
}
    
  
}