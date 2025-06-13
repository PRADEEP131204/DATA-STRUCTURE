
import java.util.*;
class Node {
	int data;
	Node next;
	Node(int data) {
		this.data = data;
	}
}
class List {
	Node head,tail;

	public void insert(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
    	public void sort(){
    	    boolean swap=true;
    	    Node end=null;
    	    while(swap){
    	        swap=false;
    	        Node current = head;
    	        while(current.next!=end){
    	            if(current.data>current.next.data){
    	                int temp = current.data;
    	                current.data=current.next.data;
    	                current.next.data=temp;
    	                swap=true;
    	            }
    	            current = current.next;
    	        }
    	        end = current;
    	    }
    	    
    	}

}

public class SORTING
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List l=new List();
		System.out.print("1.Enter a new file\n2.View desktop\n3.Arrange in order\n4.Exit\n");
		while(true) {
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
			    System.out.println("Enter the file");
				int n = sc.nextInt();
				while(true){
				  if(n<1||n>100){
				       System.out.println("Oops!!! not in the range.");
				      System.out.println("Enter the file");
				      n = sc.nextInt();
				  }  
				  else{
				      break;
				  }
				}
				l.insert(n);
				break;
			case 2:
			    System.out.println("Files are:");
				l.display();
				break;
			case 3:
			    l.sort();
			    l.display();
				break;
			default:
				System.out.println("Exit");
				return;
			}
		}
	}
}
