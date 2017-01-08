public class LinkedListTest {

	public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        System.out.println("linkedList1.size() should return 0: " + linkedList1.size());
        System.out.println("linkedList1.get(1).hasError() should return true: " + linkedList1.get(1).hasError());
        System.out.println("linkedList1.get(1).getError() should return ErrorMessage.EMPTY_STRUCTURE: " + linkedList1.get(1).getError());

        LinkedList linkedList2 = new LinkedList();
        linkedList2.add("Jack");
        linkedList2.add("Jill");
        System.out.println("linkedList2.size() should return 2: " + linkedList2.size());
        System.out.println("linkedList2.get(1).hasError() should return false: " + linkedList2.get(1).hasError());
        System.out.println("linkedList2.get(1).getReturnValue() should return \"Jill\": " + linkedList2.get(1).getReturnValue());
        linkedList2.remove(0);
        System.out.println("linkedList2.size() should return 1: " + linkedList2.size());
        System.out.println("linkedList2.get(1).hasError() should return true: " + linkedList2.get(1).hasError());
        System.out.println("linkedList2.get(0).getReturnValue() should return \"Jill\": " + linkedList2.get(0).getReturnValue());
        linkedList2.remove(0);
        System.out.println("linkedList2.size() should return 0: " + linkedList2.size());

        LinkedList linkedList3 = new LinkedList();
        linkedList3.add("Adam");
        linkedList3.add("Eve");
        linkedList3.add("Roger");
        linkedList3.add("Julie");
        System.out.println("linkedList3.size() should return 4: " + linkedList3.size());
        System.out.println("linkedList3.get(2).getReturnValue() should return \"Roger\": " + linkedList3.get(2).getReturnValue());
        linkedList3.add(2, "Alice");
        System.out.println("linkedList3.get(2).getReturnValue() should return \"Alice\": " + linkedList3.get(2).getReturnValue());
        System.out.println("linkedList3.get(3).getReturnValue() should return \"Roger\": " + linkedList3.get(3).getReturnValue());
        System.out.println("linkedList3.get(4).getReturnValue() should return \"Julie\": " + linkedList3.get(4).getReturnValue());
        System.out.println("linkedList3.size() should return 5: " + linkedList3.size());
	}

}
