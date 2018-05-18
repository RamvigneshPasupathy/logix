package ds;

public class _queue_with_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// IntegerStack s = new IntegerStack();
		// System.out.println(s.isEmpty());
		// s.push(1);
		// s.push(2);
		// System.out.println(s.peek());
		// s.pop();
		// System.out.println(s.peek());
		// System.out.println(s.isEmpty());

		IntegerQueue q = new IntegerQueue();
		q.enqueue(1);
		q.enqueue(2);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}

class IntegerQueue {
	IntegerStack s = new IntegerStack();

	public IntegerQueue() {
	}

	public Integer dequeue() {
		IntegerStack s2 = new IntegerStack();
		Integer tmp;
		while (!s.isEmpty()) {
			s2.push(s.pop());
		}
		tmp = s2.pop();
		while (!s2.isEmpty()) {
			s.push(s2.pop());
		}
		return tmp;
	}

	public void enqueue(Integer i) {
		s.push(i);
	}
}

class IntegerStack {

	final int SIZE = 20;
	Integer[] arr = new Integer[SIZE];
	int index = -1;

	public IntegerStack() {
	}

	public Integer peek() {
		if (!isEmpty()) {
			return arr[index];
		}
		return null;
	}

	public void push(Integer i) {
		if (index < SIZE - 1) {
			index++;
			arr[index] = i;
		} else {
			System.out.println("Stack size exceeded.");
		}
	}

	public Integer pop() {
		if (!isEmpty()) {
			Integer top = arr[index];
			arr[index] = null;
			index--;
			return top;
		}
		return null;
	}

	public boolean isEmpty() {
		if (index == -1) {
			return true;
		}
		return false;
	}
}
