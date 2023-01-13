package errorprone;

public class Main {

    public static void FooBar() {}
    public static void main(String[] args) {
        System.out.println("Hello");
        if (args.length > 0 && args[0].equals("")) {
            throw new IllegalArgumentException();
        }
        FooBar();
//        System.out.println("args: " + args );
    }
}