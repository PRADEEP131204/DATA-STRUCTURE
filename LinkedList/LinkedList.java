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
	public void insertatend(int data) {

		Node n = new Node(data);
		if(head==null) {
			head = n;
			tail=n;
		}
		else {
			tail.next =n;
			tail = n;
		}
	}
	public void insertatbegin(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	public void insertatspecpos(int pos,int data) {
		Node temp = head;
		Node n = new Node(data);
		for(int i=1; i<pos-1; i++) {
			temp = temp.next;
		}
		n.next = temp.next;
		temp.next=n;
	}
	public void delatbegin() {
		head = head.next;
	}
	public void delatspec(int pos) {
		Node temp = head;
		for(int i=1; i<pos-1; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	public void delatend() {
		Node temp=head;
		while(temp.next!=tail) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public void display() {
		Node temp = head;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
public class LinkedList
{
	public static void main(String[] args) {
		List l = new List();
		l.insertatend(10);
		l.insertatend(20);
		l.insertatend(30);
		l.insertatend(40);
		l.insertatend(50);
		l.insertatend(60);
		System.out.println("Insert at End");
		l.display();
		l. insertatbegin(5);
		System.out.println("Insert at Begin");
		l.display();
		l. insertatspecpos(3,15);
		System.out.println("Insert at Specific Position");
		l.display();
		l.delatbegin();
		System.out.println("Delete at Begin");
		l.display();
		l.delatspec(3);
		System.out.println("Delete at Specific Position");
		l.display();
		l.delatend();
		System.out.println("Delete at End");
		l.display();
	}
}
