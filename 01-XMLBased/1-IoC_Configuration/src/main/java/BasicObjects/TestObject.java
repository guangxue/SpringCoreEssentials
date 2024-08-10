package BasicObjects;

public class TestObject {
    private String arg;

    public TestObject() {}
    public TestObject(String arg) throws Exception {
        if(arg.trim().isEmpty()) {
            throw new Exception("String argument is empty");
        }
        this.arg = arg;
    }
    public void getName() {
        System.out.println(STR."ClassName:<\{this.getClass().getName()}}>");
    }
    public void test() {
        if(arg != null && !arg.trim().isEmpty()) {
            System.out.println(STR."<\{this.getClass().getName()}>::test(arg) is called.");
        } else {
            System.out.println(STR."<\{this.getClass().getName()}>::test() is called.");
        }
    }
}
