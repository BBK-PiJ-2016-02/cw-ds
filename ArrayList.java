public class ArrayList implements List {

	private final static int MAX_SIZE = 10000;
	private Object[] data = new Object[MAX_SIZE];
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

		return new ReturnObjectImpl(data[index]);
	}

	public ReturnObject remove(int index) {
		if(isOutOfBounds(index)) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		ReturnObjectImpl item = new ReturnObjectImpl(data[index]);
		data[index] = null;

		for(int i = index; i < size() - 1; i++) {
			data[i] = data[i+1];
		}

		data[size() - 1] = null;
		count--;

		return item;
	}

	public ReturnObject add(int index, Object item) {
		if(isOutOfBounds(index) || MAX_SIZE == size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		for(int i = size() - 1; i >= index; i--) {
			data[i+1] = data[i];
		}

		data[index] = item;
		count++;

		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	public ReturnObject add(Object item) {
		if(MAX_SIZE == size()) {
			return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
		}

		data[count] = item;
		count++;

		return new ReturnObjectImpl(ErrorMessage.NO_ERROR);
	}

	private boolean isOutOfBounds(int index) {
		return (index >= size() || index < 0);
	}
}
