/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.
Input:
N = 5
A[] = {1,2,3,5}
Output: 4
*/

public class missing {
    //Main method to find the missing element
    public static void main(String[] args) {
        int[] arr={2,1,4,5,3};
        int n=arr.length+1;
        System.out.println(Missing(arr,n));
    }
    //Function to find the missing element
    public static int Missing(int arr[], int n){
        //variables to find the sums
        int sum1=0,sum2=0;
        //loop to find sum of elements from 1 to N
        for(int i=1;i<=n;i++)
        {
            sum1+=i;
        }
        //loop to find sum of all the array elements
        for(int i=0;i<n-1;i++)
        {
            sum2+=arr[i];
        }
        //Return diff of the two sums to find the missing element
        return sum1-sum2;
    }
}
