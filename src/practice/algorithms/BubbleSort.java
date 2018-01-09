package practice.algorithms;

public class BubbleSort {

	public static void main(String [] args){
		
		BubbleSort bs = new BubbleSort();
		int [] arrToBeSorted = {5, 2, 4, 1, 3};
		bs.sort(arrToBeSorted);
	}

	private void sort(int[] arrToBeSorted) {
		int length = arrToBeSorted.length;
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-2;j++){
				if(arrToBeSorted[j]>arrToBeSorted[j+1]){
					int temp = arrToBeSorted[j+1];
					arrToBeSorted[j+1] = arrToBeSorted[j];
					arrToBeSorted[j] = temp;
				}
			}
		}
		
		print(arrToBeSorted);
		
	}
	
	private void print(int[] sortedArray){
		for(int i=0;i<sortedArray.length-1;i++){
			System.out.println(sortedArray[i]);
		}
	}
}
