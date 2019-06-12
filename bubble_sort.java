import java.io.*;
import java.util.*;

public class bubble_sort{
	public static void main(String args[]){
		System.out.println("---------------BUBBLE-SORT------------");
		System.out.println("---------SORTING-IN- ASC-ORDER--------");
		System.out.println("Enter the number of elements:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("yes "+a);
		int arr[] = new int[a];
		int i = 0;
		int j = 0;
		int temp = 0;

		System.out.println("--------------------------------------");
		for(i = 0; i < a; i++){
			System.out.println("Enter the element number "+(i+1));
			arr[i]=sc.nextInt();
		}

		System.out.println("--------------------------------------");
		System.out.println("Elements entered");
		for( i=0; i<a; i++){
			System.out.println(arr[i]);
		}

		for (i=1;i<a;i++){
			for (j=1; j<a;j++){
				if(arr[j-1]>arr[j]){
					temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;	
				}
			}
		}
		System.out.println("--------------------------------------");
		System.out.println("Elements after sorting");
		for(i=0;i<a;i++){
			System.out.println(arr[i]);
		}
	}
}