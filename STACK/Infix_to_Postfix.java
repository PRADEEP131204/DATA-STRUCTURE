import java.util.Scanner;
import java.util.Stack;

public class Infix_to_Postfix {
    
    public static int precedence(char ch){
      if(ch=='+' || ch=='-')return 1;
      else if(ch=='*' || ch=='/')return 2;
      else if(ch=='^')return 3;
      return 0;
    }
    
  
    public static String infixtoPostfix(String s){
      
      StringBuilder res=new StringBuilder();
      Stack<Character> ops=new Stack<>();
      
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        
        if(Character.isLetter(ch)){
          res.append(ch);
        }
        
        else if(ch=='('){
          ops.push('(');
        }
        
        else if(ch==')'){
          while(ops.peek()!='('){
            res.append(ops.pop());
          }
          ops.pop(); //To remove '('
        }
        
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^' ){
          while(!ops.isEmpty() && ops.peek()!='(' && 
          ((precedence(ch)<precedence(ops.peek())) || (precedence(ch)==precedence(ops.peek()) && ch!='^')))
        {
            res.append(ops.pop());
        }
        ops.push(ch);
      }
      }
        while(!ops.isEmpty()){
            res.append(ops.pop());
        }

        return res.toString();
    }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Infix Expression: ");
      String s=sc.nextLine();
      System.out.println(infixtoPostfix(s));
  }
}
