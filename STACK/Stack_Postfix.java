/*Postfix operation in Stack */

import java.util.Scanner;
import java.util.Stack;

public class Stack_Postfix{
    public static int postfix(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
                stack.push(ch-'0');
        else{
            int b=stack.pop();
            int a=stack.pop();
            int result=0;
            switch(ch){
                case '+':
                    result=a+b;
                    break;
                case '-':
                    result=a-b;
                    break;
                case '*':
                    result=a*b;
                    break;
                case '/':
                    result=a/b;
                    break;
                case '^':
                    result=(int)Math.pow(a,b);
                    break;
            }
            stack.push(result);
        }
        }
        return stack.pop();
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your expression: ");
		String s=sc.nextLine();
		System.out.println(postfix(s));
	}
}
