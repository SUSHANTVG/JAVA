package stack;

import com.app.core.Emp;

public class FixedStack implements Stack {
	private int top;
	private Emp[] e;
	
	public FixedStack() {
		top = -1;
		e = new Emp[SIZE];
	}

	@Override
	public void push(Emp e) {
		if(top < SIZE-1)
			this.e[++top] = e;
		else
			System.out.println("Stack Overflow!");
	}

	@Override
	public Emp pop() {
		if(top == -1) {
			System.out.println("Stack Underflow!");
			return null;
		}
		return e[top--];
	}
	
}
