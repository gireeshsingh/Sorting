import java.io.*;
import java.util.*;

public class quick_sort{
	public static void main(String args[]){
		System.out.println("Quick-Sort");
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr,0,n-1);
		System.out.println("Sorted elements:"+Arrays.toString(arr));
	}
	public static void sort(int arr[],int low,int high){
		if(low<high){
			int i,pivot;
			//finding pivot and then recursively calling quicksort
			pivot=partition(arr,low,high);
			sort(arr,low,pivot-1);
			sort(arr,pivot+1,high);
		}
	}
	public static int partition(int arr[], int low, int high) {
	    int pivot = arr[high];
	    int i = (low-1);
	    for (int j = low; j < high; j++) {
	        if (arr[j] <= pivot) {
	            i++;
	            int swapTemp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = swapTemp;
	        }
	    }
	    int swapTemp = arr[i+1];
	    arr[i+1] = arr[high];
	    arr[high] = swapTemp;
	    return i+1;
	}
}