public class ImprovedStackImplTest {

    public static void main(String[] args) {
        ImprovedStack stack1 = new ImprovedStackImpl(new ArrayList());
        System.out.println("stack1.isEmpty() should return true: " + stack1.isEmpty());
        System.out.println("stack1.size() should return 0: " + stack1.size());
        stack1.push("Jack");
        stack1.push("Jill");
        stack1.push("Jane");
        System.out.println("stack1.size() should return 3: " + stack1.size());
        System.out.println("stack1.isEmpty() should return false: " + stack1.isEmpty());
        System.out.println("stack1.top().getReturnValue() should return \"Jane\": " + stack1.top().getReturnValue());
        System.out.println("stack1.pop().getReturnValue() should return \"Jane\": " + stack1.pop().getReturnValue());
        System.out.println("stack1.top().getReturnValue() should return \"Jill\": " + stack1.top().getReturnValue());
        System.out.println("stack1.reverse().top().getReturnValue() should return \"Jack\": " + stack1.reverse().top().getReturnValue());
        stack1.push("Jackie");
        System.out.println("stack1.size() should return 3: " + stack1.size());
        stack1.remove(stack1.top().getReturnValue());
        System.out.println("stack1.size() should return 2: " + stack1.size());
    }

}