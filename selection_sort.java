import java.io.*;
import java.util.*;

public class selection_sort{
	public static void main(String args[]){
		System.out.println("Selection--Sort");
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
		System.out.println("Sorted elemets"+Arrays.toString(arr));
	}
	public static void sort(int arr[], int n){
		int i,min_index,temp;
		for(i=0;i<(n-1);i++){
			min_index=minimum(arr,n,i);
			if(min_index!=i){
				temp=arr[min_index];
				arr[min_index]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static int minimum(int arr[], int n, int index){
		int i;
		int min_index=index;
		int min_element=arr[index];
		for(i=min_index+1;i<n;i++){
			if(arr[i]<min_element){
				min_index=i;
				min_element=arr[i];
			}
		}
		return min_index;
	}
}