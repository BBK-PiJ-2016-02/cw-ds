public class ReturnObjectImplTest {

	public static void main(String[] args) {
		ReturnObjectImpl obj1 = new ReturnObjectImpl("String Object");
        ReturnObjectImpl obj2 = new ReturnObjectImpl(ErrorMessage.NO_ERROR);
		ReturnObjectImpl obj3 = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);

        System.out.println("obj1.hasError() should return false: " + obj1.hasError());
        System.out.println("obj1.getError() should return ErrorMessage.NO_ERROR: " + obj1.getError());
        System.out.println("obj1.getReturnValue() should return \"String Object\": " + obj1.getReturnValue());

        System.out.println("obj3.hasError() should return true: " + obj3.hasError());
        System.out.println("obj3.getError() should return ErrorMessage.INDEX_OUT_OF_BOUNDS: " + obj3.getError());
        System.out.println("obj3.getReturnValue() should return null: " + obj3.getReturnValue());
	}

}
