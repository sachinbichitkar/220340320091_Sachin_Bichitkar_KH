import java.util.Scanner;
class ReversrLinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
			next=null;
			prev=null;
		}
	}

	void append(int data){
		Node n=head;
		if(head == null){
			Node newnode=new Node(data);
			head=newnode;
		}else{
			Node newnode=new Node(data);
			while(n.next!=null){
				n=n.next;
			}
			n.next=newnode;
			newnode.prev=n;
			
		}
		
	}
	
	void reverse(){
		Node n=head;
		if(n==null){
			System.out.println("Emptylist");
		}
		while(n.next!=null){
			n=n.next;
		}
		while(n!=null){
			System.out.print(n.data+"  ");
			n=n.prev;
		}
		
	}
	
	public static void main(String args[]){
		ReversrLinkedList a = new ReversrLinkedList();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter test case : ");
		int t =sc.nextInt();
		System.out.println("Enter total number element in Linkedlist : ");
		int n=sc.nextInt();
		System.out.println("Enter elements in Linkedlist : ");
		for(int i=1;i<=n;i++){
			int data=sc.nextInt();
			a.append(data);
		}
		System.out.println("Reversed is :");
		a.reverse();
		
	}
}