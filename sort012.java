/*Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
Input: 
N = 5
arr[]= {0 2 1 2 0}
Output: 0 0 1 2 2
Explanation:0s 1s and 2s are segregated into ascending order.
 */

public class sort012 {
    //Main method to execute the function
    public static void main(String[] args) {
    int arr[]={0,1,2,1,0,2,1};
    int n=arr.length;
    Sort012(arr,n);        
    }
    //Function to sort all 0s 1s and 2s
    public static void Sort012(int a[], int n)
    {
        //counters for the count of 0 1 and 2 each
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            c0+=1;
            else if(a[i]==1)
            c1+=1;
            else
            c2+=1;
        }
        int count=0;
        //separate loops to add up elements inascending order
        while(c0>0)
        {
            a[count]=0;
            c0--;
            count++;
        }
        while(c1>0)
        {
            a[count]=1;
            c1--;
            count++;
        }
        while(c2>0)
        {
            a[count]=2;
            c2--;
            count++;
        }
        //Printing the sorted array
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
