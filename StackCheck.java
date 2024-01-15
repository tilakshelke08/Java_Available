package stack1;

import java.util.Scanner;

class stack1 {
	private int[] arr;
	private int top;

	public stack1(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int val) {
		if (isfull())
			throw new RuntimeException("stack is full");
		top++;
		arr[top] = val;
	}

	public void pop() {
		if (isempty())
			throw new RuntimeException("stack is empty");
		top--;
	}

	public int peek() {
		if (isempty())
			throw new RuntimeException("stack is empty");
		return arr[top];
	}

	public boolean isempty() {
		return top == -1;
	}

	public boolean isfull() {
		return top == arr.length - 1;
	}
}

class StackCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		stack1 ss =new stack1(6);
		int choice;
		int val=0;
		
		do {
			System.out.println("0.Exit 1.push 2.pop 3.peek 4.isempty 5.isfull");
		System.out.println("enter the choice ");
		choice=sc.nextInt();
			switch(choice) {
			
			case 1:
			try {
				System.out.println("enter the value:-");
				val=sc.nextInt();
				ss.push(val);
			} catch (Exception e) {
				System.out.println(e.getMessage( ));
			}
				
				break;
			
			case 2:
			{
				try {
					val=ss.peek();
					ss.pop();
					System.out.println("pop is :-"+val);
				} catch (Exception e) {
					System.out.println(e.getMessage( ));
				}
				
				break;
			}
			case 3:
			{
				try{
				
				ss.peek();
			} catch (Exception e) {
				System.out.println(e.getMessage( ));
			}
				
				
				break;
			}
			case 4:
				
			{
				try{
					
					ss.isempty();
				} catch (Exception e) {
					System.out.println(e.getMessage( ));
				}
				
				break;
			}
			case 5:
			{
try{
					
	ss.isfull();
				} catch (Exception e) {
					System.out.println(e.getMessage( ));
				}
				
				break;
			}
		}
		}while(choice!=0);sc.close();

}

}
