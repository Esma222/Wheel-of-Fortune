
public class Stack {

	private int top;
	private Object[] elements;
	
	Stack(int capacity) {
		top=-1;
		elements=new Object[capacity];
	}
	
	void push(Object data) {
		if(isFull()) {
			System.out.println("Stack overflow");
		}
		else {
		top++;
		elements[top]=data;
		}
	}
	
	Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
		    Object retdata=elements[top];
		    top--;
		    return retdata;
		}
	}
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
		    return elements[top];
	    }
     }
	int size() {
		return top + 1;
	}
	
	public boolean isFull() {
		return ( top + 1 == elements.length);
		}
	
	public boolean isEmpty() {
		
		return ( top == -1);
		}
	
}


