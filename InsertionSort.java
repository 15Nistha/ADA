
class ISort{
	
	void insertionSort(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]){
				arr[j+1]=arr[j];
				--j;
			}
			arr[j+1] = key;
		}
	}
	void printArr(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
			
		}
	
}}

public class InsertionSort {

	public static void main(String[] args) {
		ISort ob=new ISort();
		int arr[]={34,22,46,56,45,44,35,78,89,54,12,67,55,89,23,11,21,98,57};
		ob.insertionSort(arr);
		System.out.println("Insertion Sorted Array:  ");
		ob.printArr(arr);

	}

}
