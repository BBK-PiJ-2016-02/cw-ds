public class SampleableListImpl extends ArrayList implements SampleableList {

	public SampleableList sample() {
		SampleableListImpl sampleList = new SampleableListImpl();

		if(super.size() > 0) {
			for(int i = 0; i < super.size(); i += 2) {
				sampleList.add(
					super.get(i).getReturnValue()
				);
			}
		}

		return sampleList;
	}
}
