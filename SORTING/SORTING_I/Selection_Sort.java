// STEP 1:-- "Select min & swap"
// In this we select the mininmum. 
// Then place it at the first place and the number at that place will go to mininmums place (swap the min number and the first place number). Rest will be same.

// STEP 2:-- "Select 2nd min & swap"
// Find the second min. and swap with the second element.
// ----------------------------------------------------------------
// EXAMPLE:------

// arr= 13 46 24 52 20 9   //mini_idex=0   9 < 13

// Step 1:- 9 46 24 52 20 13
// Step 2:- 9 13 24 52 20 46
// Step 3:- 9 13 20 52 24 46
// Step 4:- 9 13 20 24 52 46
// Step 5:- 9 13 20 24 46 52
// ---------------------------------------------------------------
// PSEUDO CODE:----

// for (i=0;i<n-2;i++)
// {
//     mini= i;
//     for(j=i;j<n-1;j++)
//     {
//         if(arr[j] < arr[mini])
//         {
//             mini= j
//         }
//         swap(arr[mini],arr[i])
//     }
// }
//-----------------------------------------------------------------OWN CODE
public class HelloWorld 
{
    public static void selectionSort(int arr[], int n)
	{
	    for(int i=0;i<n-1;i++)
	    {
	        int mini_index=i;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<arr[i])
	            {
	                mini_index=j;
	            }
	        }
	        int mini=arr[i];              //mini=13
	        arr[i]=arr[mini_index];        //arr[0]=9
	        arr[mini_index]=mini;          //arr[]
	    }
	    
	}
    public static void main(String[] args) 
    {
        int arr[]={13,24,9,17,46,52};
        int n = 6;
        selectionSort(arr,n);
        System.out.println("Sorted array: ");
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i] + " ");
	    }
    }
} 
--------------------
OUTPUT:-
Sorted array: 9 12 13 14 23 52