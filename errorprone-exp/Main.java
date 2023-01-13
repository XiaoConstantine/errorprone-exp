package errorprone;

public class Main {

    private static void FooBar() {
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        if (args.length > 0 && args[0].equals("")) {
            throw new IllegalArgumentException();
        }
        System.out.println("args: " + args );
    }
}