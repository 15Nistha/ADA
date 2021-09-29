
class RSort{
	
	void radixSort(int arr[],int n,int index){
		int[] output=new int[n+1];
		int max=arr[0];
		for(int i=0; i<n;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		int[] count=new int[max+1];
		for(int i=0;i<max;i++)
			count[i]=0;
		for(int i=0;i<n;i++)
			count[(arr[i]/index)%10]++;
		for(int i=1;i<10;i++)
			count[i]+=count[i-1];
		for(int i=n-1;i>=0;i--){
			output[count[(arr[i]/index)%10]-1]=arr[i];
			count[(arr[i]/index)%10]--;
		}
		for(int i=0;i<n;i++)
			arr[i]=output[i];
	}
	
	int getMax(int arr[],int len){
		int max=arr[0];
		for(int i=1;i<len;i++)
			if(arr[i]>max)
				max=arr[i];
		return max;
	}
	
	void rsort(int arr[],int n){
		int max=getMax(arr,n);
		for(int index=1;max/index>0;index*=10)
			radixSort(arr,n,index);
	}
	
	void printArr(int arr[]){
		int n=arr.length;
		for(int i=0; i<n; i++){
			System.out.print(arr[i] +" ");
			
		}
	}
}

public class RadixSort {

	public static void main(String[] args) {
		RSort ob=new RSort();
		int arr[]={12,98,78,56,75,43,21,34,53,76,13,44,79};
		int n=arr.length;
		ob.rsort(arr, n);
		System.out.println("Radix Sorted Array: ");
		ob.printArr(arr);
	}

}
