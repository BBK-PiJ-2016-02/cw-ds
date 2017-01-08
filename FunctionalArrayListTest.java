public class FunctionalArrayListTest {

	public static void main(String[] args) {
		FunctionalArrayList funcArrayList1 = new FunctionalArrayList();
		funcArrayList1.add("Jack");
		funcArrayList1.add("Jill");
		funcArrayList1.add("Jane");
		System.out.println("funcArrayList1.size() should return 2: " + funcArrayList1.size());
		System.out.println("funcArrayList1.head().getReturnValue() should return \"Jack\": " + funcArrayList1.head().getReturnValue());
		System.out.println("funcArrayList1.rest().size() should return 1: " + funcArrayList1.rest().size());
		System.out.println("funcArrayList1.rest().get(0).getReturnValue() should return \"Jill\": " + funcArrayList1.rest().get(0).getReturnValue());
		System.out.println("funcArrayList1.rest().get(1).getReturnValue() should return \"Jane\": " + funcArrayList1.rest().get(1).getReturnValue());
	}

}
