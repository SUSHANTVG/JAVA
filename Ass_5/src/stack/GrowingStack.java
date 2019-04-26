package stack;

import com.app.core.Emp;

public class GrowingStack implements Stack {
	private int top;
	private Emp[] e;
	
	public GrowingStack() {
		top = -1;
		e = new Emp[SIZE];
	}

	@Override
	public void push(Emp e) {
		if(top < this.e.length - 1)
			this.e[++top] = e;
		else {
			Emp[] temp = new Emp[this.e.length * 2];
			for(int i=0;i<this.e.length;i++)
				temp[i] = this.e[i];
			this.e = temp;
			this.e[++top] = e;
		}
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
