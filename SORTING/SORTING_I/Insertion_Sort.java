// STEP:-- "Go from start+1 amd make adjacent swaps if (j>0 and arr[j-1] > arr[j]) and decrement the value of j=j-1;"
// Then increment the value of i and move forward in the list(arr).
// ----------------------------------------------------------------
// PSEUDO CODE :-----

// procedure insertionSort(A: list of sortable items)
//    n = length(A)
//    for i = 1 to n - 1 do
//        j = i
//        while j > 0 and A[j-1] > A[j] do
//            swap(A[j], A[j-1])
//            j = j - 1
//        end while
//    end for
// end procedure
-----------------------------------------------------------------OWN CODE
class HelloWorld 
{
    public static void insertionSort(int arr[], int n)
    {
        for(int i=1;i<n-1;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j])
            {
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j=j-1;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[]={23,14,12,9,13,52};
        int n=6;
        insertionSort(arr,n);
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