package stack;

import com.app.core.Emp;

public interface Stack {
	int SIZE = 5;
	void push(Emp e);
	Emp pop();
}
