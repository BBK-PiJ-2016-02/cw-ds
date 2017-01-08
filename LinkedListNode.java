public class LinkedListNode {
	private Object value;
	private LinkedListNode next;

	public LinkedListNode(Object value) {
		setValue(value);
	}

	public LinkedListNode getNext() {
		return this.next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

	public Object getValue() {
		return this.value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
}
