
class MSort{
	
	void merge(int arr[],int a, int b, int c){
		int n1=b-a+1;
		int n2=c-b;
		int L[]=new int[n1];
		int M[]=new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=arr[a+i];
		for(int j=0;j<n2;j++)
			M[j]=arr[b+1+j];
			
		int i=0,j=0,k=a;
		while(i<n1 && j<n2){
			if(L[i]<=M[j]){
				arr[k]=L[i];
				i++;
			}
			else{
				arr[k]=M[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k]=L[i];
			i++; k++;
		}
		while(j<n2){
			arr[k]=M[j];
			j++; k++;
		}
		}
	
	void mergeSort(int arr[],int l,int r){
		if(l<r){
			int m=(l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	
	void printArr(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
			
		}
	}
	
}


public class MergeSort {

	public static void main(String[] args) {
		MSort ob=new MSort();
		int arr[]={23,44,12,11,54,24,36,67,43,68,87,98,69};
		ob.mergeSort(arr, 0, arr.length-1);
		System.out.println("Merge Sorted Array: ");
		ob.printArr(arr);
	}

}
