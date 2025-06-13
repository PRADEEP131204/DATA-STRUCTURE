//STACK BRACKET
import java.util.*;

public class ValidateParanthesesUsingStack
{
	public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(int i=0;i<=s.length()-1;i++){
        char ch = s.charAt(i);
        if(ch=='('||ch=='{'||ch=='['){
        stack.push(ch);
        }
        else{
            if(stack.isEmpty()){
              return false;  
            } 
           char top = stack.pop();
           if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
               return false;
           }
        }
    }
    return stack.isEmpty();
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size:");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
	String s = sc.nextLine();
	System.out.println(isValid(s));
		}
}

}