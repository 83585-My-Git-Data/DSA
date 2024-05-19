package com.sunbeam.q1;

public class q5 {
	public static class Stack {
		private int arr[];
		private int top;
		private final int SIZE;
		public Stack(int size) {
			SIZE = size;
			arr = new int[SIZE];
			top = -1;
		}
		
		public void push(int value) {
			//1. reposition top
			top++;
			//2. add value at top index
			arr[top] = value;
		}
		
		public int pop() {
			//1. reposition top and return value of top index
			return arr[top--];
		}
		
		public int peek() {
			//1. read and return value of top index
			return arr[top];
		}
		
		public boolean isEmpty(){
			return top == -1;
		}
		
		public boolean isFull() {
			return top == SIZE - 1;
		}


	}
	public static int calculate(int op1, char opr, int op2) {
		switch(opr) {
		case '+': return op1 + op2;
		case '-': return op1 - op2;
		case '/': return op1 / op2;
		case '*': return op1 * op2;
		case '%': return op1 % op2;
		case '$': return (int)Math.pow(op1, op2);
		}
		return 0;
	}
	
	public static int postfixEvaluate(String postfix) {
		//1. create stack to store operands
		Stack st = new Stack(10);
		//2. process postfix expression from  left to right
		for(int i = 0 ; i < postfix.length() ; i++) {
			//3. extract element from string (index i)
			char ele = postfix.charAt(i);
			//4. check if operand
			if(Character.isDigit(ele))
				//5. push operand on stack
				st.push(ele - '0');  // convert string to integer form
			//6. if ele is operator
			else {
				//7. pop two elements from stack
				int op2 = st.pop();
				int op1 = st.pop();
				//8. perform operation of ele, op1 and op2
				int res = calculate(op1, ele, op2);
				//9. push result on stack
				st.push(res);
			}
		}
		//10. reture result by peeking from stack
		if(!st.isEmpty())
			return st.peek();
		return 0;
	}
	
	public static int prefixEvaluate(String prefix) {
		//1. create stack to store operands
		Stack st = new Stack(10);
		//2. process prefix expression from right to left
		for(int i = prefix.length()-1 ; i >= 0 ; i--) {
			//3. extract element from string (index i)
			char ele = prefix.charAt(i);
			//4. check if operand
			if(Character.isDigit(ele))
				//5. push operand on stack
				st.push(ele - '0');
			//6. if ele is operator
			else {
				//7. pop two elements from stack
				int op1 = st.pop();
				int op2 = st.pop();
				//8. perform operation of ele, op1 and op2
				int res = calculate(op1, ele, op2);
				//9. push result on stack
				st.push(res);
			}
		}
		//10. return result by peeking from stack
		if(!st.isEmpty())
			return st.peek();
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String postfix = "456*3/+9+7-";
		
		System.out.println("Postfix : " + postfix);
		int result = postfixEvaluate(postfix);
		System.out.println("Result : " + result);
		
		String prefix = "-++4/*56397";
		System.out.println("Prefix  : " + prefix);
		result = prefixEvaluate(prefix);
		System.out.println("Result : " + result);

	}

}
