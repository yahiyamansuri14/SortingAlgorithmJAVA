import java.util.*;
class Selection_Sort{
	
	public void sort(int a[]){
		int n=a.length;
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(a[i]<a[j]){
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
		}
	}
	public void printArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static void main(String args[]){
		Selection_Sort obj=new Selection_Sort();
		int a[]={10,20,40,60,10};
		obj.sort(a);
		System.out.println("Sorted Array is:-");
		obj.printArray(a);
	}
}