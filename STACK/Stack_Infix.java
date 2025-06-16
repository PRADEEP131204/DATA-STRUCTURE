import java.util.Scanner;
import java.util.Stack;

public class Stack_Infix {
    
    public static int precedence(char ch){
      if(ch=='+' || ch=='-')return 1;
      else if(ch=='*' || ch=='/')return 2;
      else if(ch=='^')return 3;
      return 0;
    }
    
    public static int calculate(int a,int b,char op){
      switch(op){
        case '+':return a+b;
        case '-':return a-b;
        case '*':return a*b;
        case '/':return a/b;
        case '^':return (int)Math.pow(a,b);
      }
      return 0;
    }
  
    public static int infix(String s){
      
      Stack<Integer> value=new Stack<>();
      Stack<Character> ops=new Stack<>();
      
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        
        if(Character.isDigit(ch)){
          value.push(ch-'0');
        }
        
        else if(ch=='('){
          ops.push('(');
        }
        
        else if(ch==')'){
          while(ops.peek()!='('){
            int b=value.pop();
            int a=value.pop();
            char op=ops.pop();
            value.push(calculate(a,b,op));
          }
          ops.pop(); //To remove '('
        }
        
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^' ){
          while(!ops.isEmpty() && ops.peek()!='(' && 
          ((precedence(ch)<precedence(ops.peek())) || (precedence(ch)==precedence(ops.peek()) && ch!='^')))
        {
            int b=value.pop();
            int a=value.pop();
            char op=ops.pop();
            value.push(calculate(a,b,op)); 
        }
        ops.push(ch);
        }
      }
        
        while(!ops.isEmpty()){
            int b=value.pop();
            int a=value.pop();
            char op=ops.pop();
            value.push(calculate(a,b,op));
        }

        return value.pop(); 
    }
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Infix Expression: ");
      String s=sc.nextLine();
      System.out.println(infix(s));
  }
}

