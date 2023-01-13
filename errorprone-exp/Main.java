package errorprone;

public class Main {

    private static void FooBar() {
        System.out.println("foo bar");
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        if (args.length > 0 && args[0].equals("")) {
            new IllegalArgumentException();
        }
        FooBar();
        System.out.println("args: " + args );
    }
}