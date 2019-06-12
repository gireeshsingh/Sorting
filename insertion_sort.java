import java.io.*;
import java.util.*;

public class insertion_sort{
	public static void main(String args[]){
		System.out.println("Insertion-Sort:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter-the-number-of-elements:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int i =0;
		System.out.println("Enter-the-number-of-elements:");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr,n);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int arr[], int n){
		int j,key,i;
		for(j=1;j<n;j++){
			key=arr[j];
			i=j-1;
			while((i>-1)&&arr[i]>key){
				arr[i+1]=arr[i];
				i=i-1;
			}
			arr[i+1]=key;
		}
	}
}