public class ArrayListTest {

	public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        System.out.println("arrayList1.size() should return 0: " + arrayList1.size());
        System.out.println("arrayList1.get(1).hasError() should return true: " + arrayList1.get(1).hasError());
        System.out.println("arrayList1.get(1).getError() should return ErrorMessage.EMPTY_STRUCTURE: " + arrayList1.get(1).getError());

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Jack");
        arrayList2.add("Jill");
        System.out.println("arrayList2.size() should return 2: " + arrayList2.size());
        System.out.println("arrayList2.get(1).hasError() should return false: " + arrayList2.get(1).hasError());
        System.out.println("arrayList2.get(1).getReturnValue() should return \"Jill\": " + arrayList2.get(1).getReturnValue());
        arrayList2.remove(0);
        System.out.println("arrayList2.size() should return 1: " + arrayList2.size());
        System.out.println("arrayList2.get(1).hasError() should return true: " + arrayList2.get(1).hasError());
        System.out.println("arrayList2.get(0).getReturnValue() should return \"Jill\": " + arrayList2.get(0).getReturnValue());
        arrayList2.remove(0);
        System.out.println("arrayList2.size() should return 0: " + arrayList2.size());

        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("Adam");
        arrayList3.add("Eve");
        arrayList3.add("Roger");
        arrayList3.add("Julie");
        System.out.println("arrayList3.size() should return 4: " + arrayList3.size());
        System.out.println("arrayList3.get(2).getReturnValue() should return \"Roger\": " + arrayList3.get(2).getReturnValue());
        arrayList3.add(2, "Alice");
        System.out.println("arrayList3.get(2).getReturnValue() should return \"Alice\": " + arrayList3.get(2).getReturnValue());
        System.out.println("arrayList3.get(3).getReturnValue() should return \"Roger\": " + arrayList3.get(3).getReturnValue());
        System.out.println("arrayList3.get(4).getReturnValue() should return \"Julie\": " + arrayList3.get(4).getReturnValue());
        System.out.println("arrayList3.size() should return 5: " + arrayList3.size());
	}

}
