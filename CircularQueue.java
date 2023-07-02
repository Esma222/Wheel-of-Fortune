
public class CircularQueue {
	private int rear,front;
	private Object elements[];
	
	CircularQueue(int capacity){
		elements=new Object[capacity];
		rear=-1;
		front=0;
	}
	 void Enqueue(Object  data) {
	        rear = (rear + 1)  % elements.length;
	        elements[rear] = data;
	    }

	    Object Dequeue() { 
	    	Object data = elements[front]; 
	    	elements[front] = null; 
	    	front = (front + 1) % elements.length; 
	    	return data; }

	    Object  Peek() { Object data = elements[front]; return data; }

	    boolean isEmpty() {
	        if (elements[front] == null)
	            return true;
	        else
	            return false;

	    }

	    boolean isFull() {
	        if (front == ( rear + 1) % elements.length && elements[front] != null && elements[rear] != null)
	            return true;
	        else
	            return false;
	    }

	    int size() {
	        if(elements[front] == null)
	            return 0;
	        else{
	            if(rear >= front)
	                return rear-front + 1;
	            else
	                return elements.length - (front - rear) + 1;
	        }
	    }
}

