class TwoStackInSingleArray{
	
	int size=10;
	int t1,t2;
	
	int a[]=new int[10];
	
	TwoStackInSingleArray(){
		t1=-1;
		t2=size;
	}
	
	void push1(int data){
		if(t1<t2-1){
			t1=t1+1;
			a[t1]=data;
		}else{
			System.out.println("Overflow");
		}
	}
	void push2(int data){
		if(t1<t2-1){
			t2=t2-1;
			a[t2]=data;
		}else{
			System.out.println("Overflow");
		}
	}
	
	int pop1(){
		if(t1>=0){
			int x=a[t1];
			t1=t1-1;
			return x;
		}else{
			System.out.println("Overflow ");
			return 0;
		}
	}
	int pop2(){
		if(t2<size){
			int x=a[t2];
			t2=t2+1;
			return x;
		}else{
			System.out.println("Overflow ");
			return 0;
		}
	}
	
	public static void main(String args[]){
		TwoStackInSingleArray a= new TwoStackInSingleArray();
		a.push1(5);
		a.push2(10);
		a.push2(15);
		a.push1(11);
		a.push2(7);
		a.push2(40);
		
		System.out.println("Popped element from stack1 is : "+a.pop1());
		System.out.println("Popped element from stack2 is : "+a.pop2());
		
		
	}
}