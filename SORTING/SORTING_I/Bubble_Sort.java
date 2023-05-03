// STEP:-- "Go from start amd make adjacent swaps of arr[j] and arr[j+1]"
// Then the max element will go at the end and we will decrease it frrom end to traverse.
// ----------------------------------------------------------------
// EXAMPLE:------

// arr= 13 46 24 52 20 9   

// // Step 1:- i=0 j<(6-0-1)= j<5
//             j=0 13 46 24 52 20 9   
//             j=1 13 24 46 52 20 9
//             j=2 13 24 46 52 20 9
//             j=3 13 24 46 20 52 9
//             j=4 13 24 46 20 9  52
// // Step 2:- i=1 j<(6-1-1)=j<4
//             j=0 13 24 46 20 9  52
//             j=1 13 24 46 20 9  52
//             j=2 13 24 20 46 9 52
//             j=3 13 24 20 9 46 52
// // Step 3:- i=2 j<(6-2-1)=j<3
//             j=0 13 24 20 9 46 52
//             j=1 13 20 24 9 46 52
//             j=2 13 20 9  24 46 52
// // Step 4:- i=3 j<(6-3-1)=j<2
//             j=0 13 20 9 24 46 52
//             j=1 13 9 20 24 46 52
// // Step 5:- i=4 j<(6-4-1)=j<1
//             j=0 9 13 20 24 46 52
// ---------------------------------------------------------------
// PSEUDO CODE:----

// for (i=0;i<n-1;i++)       // i<(6-1)=i<5
// {
//     for(j=0;j<n-i-1;j++)
//     {
//         if(arr[j] > arr[j+1])
//         {
//             int temp=arr[j];
//             arr[j]=arr[j+1];
//             arr[j+1]=temp;
//         }
//         print the sorted error
//     }
// }
-----------------------------------------------------------------OWN CODE
class HelloWorld 
{
    public static void bubbleSort(int arr[], int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={23,14,12,9,13,52};
        int n=6;
        bubbleSort(arr,n);
        System.out.println("Sorted array: ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }  
    }
}
--------------------
OUTPUT:-
Sorted array: 9 12 13 14 23 52