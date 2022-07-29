/*Given an array Arr (distinct elements) of size N. Rearrange the elements of array in zig-zag fashion. The converted array should be in form a < b > c < d > e < f. The relative order of elements is same in the output i.e you have to iterate on the original array only.

Input:
N = 7
Arr[] = {4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1
 */

public class zigzag {
    //Function to arrange in zigzag fashion
    static void zigZag(int arr[],int n)
    {
        //iterative variavle
        int a=0;
        //traversing through the array
        while(a<n-1)
        {
            //check for even indexes
            if(a%2==0)
            {
            //checking if value at the index is greater than next index or not
            if(arr[a]>arr[a+1])
            {
                int x=arr[a];
                arr[a]=arr[a+1];
                arr[a+1]=x;
            }
            }
            else
            {
            //checking if value at the index is greater than next index or not
            if(arr[a]<arr[a+1])
            {
                int x=arr[a];
                arr[a]=arr[a+1];
                arr[a+1]=x;
            }
            }
            //incrementing iterable
            a++;
        }
        //printing the newwly arranged array
        for(int i=0;i<n;i++)
        {
        System.out.print(arr[i]+" ");
        }
}
//main method to execute the function
    public static void main(String[] args) {
        int arr[]={4, 3, 7, 8, 6, 2, 1};
        int n=arr.length;
        zigZag(arr,n);
    
    }
}