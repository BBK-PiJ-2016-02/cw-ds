public class ArrayList implements List {

	public boolean isEmpty() {
		return false;
	}

	public int size() {
		return 0;
	}

	public ReturnObject get(int index) {
		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
	}

	public ReturnObject remove(int index) {
		return new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
	}

	public ReturnObject add(int index, Object item) {
		return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
	}

	public ReturnObject add(Object item) {
		return new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
	}
}
