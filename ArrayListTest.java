public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList arrayList1 = new ArrayList();
        System.out.println("arrayList1.size() should return 0: " + arrayList1.size());
        System.out.println("arrayList1.get(1).hasError() should return true: " + arrayList1.get(1).hasError());
        System.out.println("arrayList1.get(1).getError() should return ErrorMessage.EMPTY_STRUCTURE: " + arrayList1.get(1).getError());
	}

}
