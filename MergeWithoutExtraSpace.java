/*Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order without using any extra space. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.
 */

import java.util.*;
public class MergeWithoutExtraSpace 
{
     //Main method to execute Merge function
    public static void main(String[] args) {
        int arr1[]={1,3,5,7};
        int arr2[]={0,2,4,6,10};
        Merge(arr1,arr2);
    }
//Method to merge two arrays without using a third array
    public static void Merge(int arr1[],int arr2[])
    {
        //Loop to sort the first array
        for(int i=0;i<arr2.length;i++)
            {
            for(int j=0;j<arr1.length;j++)
                {
                    if(arr2[i]<arr1[j])
                    {
                    int x=arr2[i];
                    arr2[i]=arr1[j];
                    arr1[j]=x;
                    }
                }
            }
        //sort the second array
        Arrays.sort(arr2);
    
        //Printing the two arrays
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}

