
class Sort{
	
	void bubbleSort(int arr[]){
		int n=arr.length;
		for(int i=0; i<n-1; i++){
			for(int j=0; j<n-i-1; j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	void printArr(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
			
		}
	}

	
}

public class BubbleSort {

	public static void main(String[] args) {
		Sort ob =new Sort();
		int arr[]={34,22,46,56,45,44,35,78,89,54,12};
		ob.bubbleSort(arr);
		System.out.println("Bubble Sorted Array: ");
		ob.printArr(arr);
	}

	}


