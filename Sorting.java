import java.util.Scanner;
class Sorting{
	
	void insertionSort(int a[]){
		
		int n= a.length;
		for(int i=n-1;i>0;i--){
			int k=a[i];
			int j=i-1;
			
			while(j>=0 && a[j]>k){
				a[j+1]=a[j];
				j--;
			}
			display(a);
			a[j+1]=k;
			
		}
	}
	
	void display(int a[]){
		for(int x: a){
			System.out.print("  "+x);
		}
		System.out.println("");
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		Sorting revar= new Sorting();
		
		System.out.println("Enter the size of an array : ");
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		System.out.println("Enter elements of an array : ");
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		//revar.display(arr);
		revar.insertionSort(arr);
		//revar.display(arr);
	}
}