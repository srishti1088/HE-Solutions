package practice.algorithms;

import java.awt.print.Printable;

public class BubbleSort {

	public static void main(String [] args){
		
		BubbleSort bs = new BubbleSort();
		//int [] arrToBeSorted = {5, 9, 4, 7, 3, 8, 6, 2, 1};
		int [] arrToBeSorted = {1,2,3,4,5,6,7,8,9};
		System.out.print("Array to be Sorted: "); 
		bs.print(arrToBeSorted);
		//bs.sort(arrToBeSorted);
		bs.optimizedSort(arrToBeSorted);
	}

	private void sort(int[] arrToBeSorted) {
		int length = arrToBeSorted.length;
		for(int i=0;i<length-1;i++){
			System.out.println();
			System.out.println("\n Pass "+ i);
			for(int j=0;j<length-1-i;j++){
				System.out.println();
				print(arrToBeSorted);
				if(arrToBeSorted[j]>arrToBeSorted[j+1]){
					int temp = arrToBeSorted[j+1];
					arrToBeSorted[j+1] = arrToBeSorted[j];
					arrToBeSorted[j] = temp;
					System.out.print("-->");
					print(arrToBeSorted);
				}else{
					System.out.print("--> No Swap");
				}
			}
		}
		
		System.out.println("\n");
		System.out.print("Sorted Array: ");
		print(arrToBeSorted);
		
	}
	
	private void optimizedSort(int[] arrToBeSorted) {
		boolean swapped = false;
		int length = arrToBeSorted.length;
		for(int i=0;i<length-1;i++){
			System.out.println();
			System.out.println("\n Pass "+ i);
			for(int j=0;j<length-1-i;j++){
				System.out.println();
				print(arrToBeSorted);
				if(arrToBeSorted[j]>arrToBeSorted[j+1]){
					int temp = arrToBeSorted[j+1];
					arrToBeSorted[j+1] = arrToBeSorted[j];
					arrToBeSorted[j] = temp;
					System.out.print("-->");
					print(arrToBeSorted);
					swapped = true;
				}else{
					System.out.print("--> No Swap");
				}
				
			}
			
			if(swapped == false){
				break;
			}
		}
		
		System.out.println("\n");
		System.out.print("Sorted Array: ");
		print(arrToBeSorted);
		
	}
	
	private void print(int[] sortedArray){
		for(int i=0;i<sortedArray.length;i++){
			System.out.print(sortedArray[i]);
		}
	}
}
