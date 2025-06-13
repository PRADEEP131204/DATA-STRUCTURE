//Doubly Linked List
import java.util.*;
class Node {
	int data;
	Node next;
	Node prv;
	Node(int data) {
		this.data=data;
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
			n.prv=tail;
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
	public void reverse() {
		Node temp=tail;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.prv;
			}
			System.out.println();
		}
	}

}

public class DoublyLinekList
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List l=new List();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		System.out.println("Initial insertion in List");
		l.display();
		System.out.println("Reverse:");
		l.reverse();

	}
}
