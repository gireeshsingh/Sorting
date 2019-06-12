import java.io.*;
import java.util.*;

public class merge_sort{
	public static void main(String args[]){
		System.out.println("-----------------MERGE-SORT---------------");
		System.out.println("------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("------------Enter-the-number-of-elements--");
		int a = sc.nextInt();
		int i =0;
		int j =0;
		int arr[] = new int[a];

		System.out.println("-----Enter-the-elements-------------------");
		for (i=0;i<a;i++){
			System.out.println("------------Enter the element number--" + (i+1));
			arr[i]=sc.nextInt();
		}
		sort(arr, 0, a-1);
		System.out.println("-----Final-sorted-elements-------------------");
		System.out.println(Arrays.toString(arr));
	}

	public static void sort(int arr[], int low, int high){
		if(high-low+1>1){
			int mid=(low+high)/2;
			sort(arr,low,mid);
			sort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	public static void merge(int arr[], int low, int mid, int high){
		int i=low;
		int j=mid+1;
		int k=0;
		int[] c= new int[high-low+1];

		while(i<=mid && j<=high){
			if(arr[i]<arr[j]){
				c[k]=arr[i];
				i=i+1;
			}
			else{
				c[k]=arr[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<=mid){
			c[k]=arr[i];
			k=k+1;
			i=i+1;
		}
		while(j<=high){
			c[k]=arr[j];
			k=k+1;
			j=j+1;
		}
		k=0;
        for(i = low; i<=high; i++){
            arr[i] = c[k++];
        }
	}
}