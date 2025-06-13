//STACK
import java.util.*;
class Stack {
    	int top=-1;
    	int n;
     int[] arr;
   Stack(int n){
        this.n = n;
         arr = new int[n];
    }
    
	public void push(int data) {
	    if(top==n-1){
	         System.out.println("Stack is full");
	    }
		top++;
		arr[top] =data;
	}
	public void pop() {
	     if(top==-1){
	        System.out.println("Stack is empty");
	    }
	    System.out.println("The popped element is "+arr[top]);
		top--;
	}
	public void display() {
	    if(top==-1){
	        System.out.println("Stack is empty");
	    }
		for(int i=0; i<=top; i++) {
			System.out.println(arr[i]);
		}
	}

}
public class GetStackSizeFromUser
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum size of the stack");
		int n = sc.nextInt();
		Stack s = new Stack(n);
	System.out.println("Choice 1 : Push\nChoice 2 : Pop\nChoice 3 : Display\nAny other choice : Exit");
	
		while(true){
		    	System.out.println("Enter your choice");
		    int ch = sc.nextInt();
		    switch(ch){
		    case 1:
		        System.out.println("Enter the element to be pushed");
		        int data = sc.nextInt();
		        s.push(data);
		        break;
		   case 2:
		       s.pop();
		       break;
		  case 3:
		      System.out.println("The contents of the stack are ");
		      s.display();
		      break;
		  default:
		      System.out.println("END");
		      return;
		}
		}

	}
	}
