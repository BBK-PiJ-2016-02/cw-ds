public class ReturnObjectImpl implements ReturnObject {

	private Object object;

	public ReturnObjectImpl(Object obj) {
		this.object = obj;
	}

	public boolean hasError() {
		return false;
	}

	public ErrorMessage getError() {
		// TODO: return NO_ERROR if hasError is false
	}

	public Object getReturnValue() {
		if(hasError()) {
			return null;
		}

		return object;
	}

}
