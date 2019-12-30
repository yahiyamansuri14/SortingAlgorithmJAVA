class BubbleSortRecursion{
	static void bubbleSort(int a[],int n){
		if(n==1)
			return;
		for(int i=0;i<n-1;i++){
			if(a[i]>a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		bubbleSort(a,n-1);
		}
		
	}
	static void printArray(int a[],int n){
		System.out.println("Sorted Array is:-");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public static void main(String args[]){
		int a[]={8,9,1,2,4,3,5,3,7};
		bubbleSort(a,a.length);
		printArray(a,a.length);
	}
	
}