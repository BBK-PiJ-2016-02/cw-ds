public class ReturnObjectImpl implements ReturnObject {

	private Object object;
	private ErrorMessage errorMsg = ErrorMessage.NO_ERROR;

	public ReturnObjectImpl(Object obj) {
		this.object = obj;
	}

	public ReturnObjectImpl(ErrorMessage errorMsg) {
		this.errorMsg = errorMsg;
	}

	public boolean hasError() {
		return errorMsg != ErrorMessage.NO_ERROR;
	}

	public ErrorMessage getError() {
		return errorMsg;
	}

	public Object getReturnValue() {
		return hasError() ? null : object;
	}

}
