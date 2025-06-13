import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class List{
    Node head,tail;
    public void append(int data){
      Node n = new Node(data);
      if(head == null){
          head = n;
          tail=n;
      }
      else{
         tail.next = n;
         tail =n;
          }
         
          
      }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void profit(){
        int sum=0;
        Node temp = head;
         while(temp!=null){
           sum+=temp.data;  
           temp= temp.next;
         }
         System.out.println("Gained Points:"+sum);
    }
}
public class FoodCourt
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List l = new List();
	System.out.println("Enter your choice \n1.Visit the food court \n2.View my transactions \n3.Show my points");

	int amt;
  while(true){
      System.out.print("Enter your choice:");
	    int ch = sc.nextInt();
	    
	switch(ch){
	    case 1:
	        System.out.println("Pay Bill Amount:");
	        amt =sc.nextInt();
	        l.append(amt);
	        break;
	   case 2:
	        System.out.println("Card Transcation:");
	        l.display();
	        break;
	   case 3:
	        l.profit();
	        break;
	   default:
	    System.out.println("Please visit again");
	    return;
	}
	}
	}
}
