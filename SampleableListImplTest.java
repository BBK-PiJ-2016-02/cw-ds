public class SampleableListImplTest {

	public static void main(String[] args) {
		SampleableListImpl sampleableList1 = new SampleableListImpl();
		sampleableList1.add("Jack");
		sampleableList1.add("Jill");
		sampleableList1.add("Jane");
		System.out.println("sampleableList1.size() should return 3: " + sampleableList1.size());
		System.out.println("sampleableList1.sample.size() should return 2: " + sampleableList1.sample().size());
		sampleableList1.remove(0);
		System.out.println("sampleableList1.sample.size() should return 1: " + sampleableList1.sample().size());
	}
}
