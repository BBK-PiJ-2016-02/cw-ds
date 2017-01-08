public class LinkedList implements List {

	private LinkedListNode first;
	private int count = 0;

	public boolean isEmpty() {
		return false;
	}

	public int size() {
		return count;
	}

	public ReturnObject get(int index) {
		if(size() == 0) {
			return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
		}

		if(isOutOfBounds(index)) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		int i = 0;
		LinkedListNode node = first;
		while(i != index) {
			node = node.getNext();
			i++;
		}

		return new ReturnObjectImpl(node.getValue());
	}

	public ReturnObject remove(int index) {
		if(isOutOfBounds(index)) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		ReturnObjectImpl item;

		if(index == 0) {
			item = new ReturnObjectImpl(first.getValue());
			first = first.getNext();
		} else {
			int i = 0;
			LinkedListNode prev = null;
			LinkedListNode node = first;

			while(i != index) {
				prev = node;
				node = node.getNext();
				i++;
			}

			item = new ReturnObjectImpl(node.getValue());
			prev.setNext(node.getNext());
		}

		count--;

		return item;
	}

	public ReturnObject add(int index, Object item) {
		if(isOutOfBounds(index)) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		int i = 0;
		LinkedListNode node = first;

		while(i != size() - 1) {
			node = node.getNext();
			i++;
		}

		LinkedListNode next = new LinkedListNode(item);
		next.setNext(node.getNext());
		node.setNext(next);
		count++;

		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	public ReturnObject add(Object item) {
		if(size() == 0) {
			first = new LinkedListNode(item);
		} else {
			int i = 0;
			LinkedListNode node = first;

			while(i < size() - 1) {
				node = node.getNext();
				i++;
			}
			node.setNext(new LinkedListNode(item));
		}
		count++;

		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	private boolean isOutOfBounds(int index) {
		return (index >= size() || index < 0);
	}
}
