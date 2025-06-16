/*Prefix operation in Stack */

import java.util.Scanner;
import java.util.Stack;

public class Stack_Prefix{
    public static int postfix(String s){
        Stack<Integer> stack = new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
                stack.push(ch-'0');
        else{
            int a=stack.pop();
            int b=stack.pop();
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
