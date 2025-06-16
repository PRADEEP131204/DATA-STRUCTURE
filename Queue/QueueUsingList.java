import java.io.*;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
	}
}
class Queue {
	Node head,tail;
    public boolean IsEmpty(){
        if(head==null&&tail==null)return true;
        return false;
    }
	public void Enqueue(int data) {
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


	public void Dequeue() {
	    if(IsEmpty()){
	        System.out.println("Queue is Empty");
	        return;
	    }
		head=head.next;
	}


	public void display() {
		Node temp=head;
		if(IsEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}

public class QueueUsingList
{
	public static void main(String[] args) {
		Queue q=new Queue();
			q.Dequeue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		System.out.println("Initial insertion in Queue:");
		q.display();
		System.out.println("After delete:");
		q.Dequeue();
		q.Dequeue();
		q.display();
	}
}
