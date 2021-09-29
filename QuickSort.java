
class QSort{
	
	int partition(int arr[],int low, int high){
		int pivot=arr[high];
		int i=(low-1);
		for(int j=low;j<high;j++){
			if(arr[j]<=pivot){
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return(i+1);
	}
	
	void quickSort(int arr[],int low, int high){
		if(low<high){
			int p=partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	
	void printArr(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
			
		}
	}
}

public class QuickSort {

	public static void main(String[] args) {
		QSort ob=new QSort();
		int arr[]={98,76,35,78,56,87,23,24,67,72,11,15,34,45,73};
		int n=arr.length;
		ob.quickSort(arr, 0, n-1);
		System.out.println("Quick Sorted Array: ");
		ob.printArr(arr);
	}

}
