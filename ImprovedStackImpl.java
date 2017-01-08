public class ImprovedStackImpl implements ImprovedStack {

    private List list;

    public ImprovedStackImpl(List list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void push(Object item) {
        list.add(item);
    }

    public ReturnObject top() {
        return list.get(size() - 1);
    }

    public ReturnObject pop() {
        return list.remove(size() - 1);
    }

    public ImprovedStack reverse() {
        ImprovedStack reversed = new ImprovedStackImpl(new ArrayList());

        int i = size();
        while(i-- != 0) {
            reversed.push(list.get(i).getReturnValue());
        }

        return reversed;
    }

    public void remove(Object object) {
        int i = size();
        while(i-- != 0) {
            if(object.equals(list.get(i).getReturnValue())) {
                list.remove(i);
            }
        }
    }

}
