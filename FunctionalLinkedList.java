public class FunctionalLinkedList extends LinkedList implements FunctionalList {

    public ReturnObject head() {
        return super.get(0);
    }

    public FunctionalList rest() {
        FunctionalArrayList list = new FunctionalArrayList();

        if(super.size() > 1) {
            for(int i = 1; i < super.size(); i++) {
                list.add(super.get(i).getReturnValue());
            }
        }

        return list;
    }

}
