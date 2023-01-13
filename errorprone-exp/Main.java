package errorprone;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        if (args.length > 0 && args[0].equals("")) {
            new IllegalArgumentException();
        }
        System.out.println("args: " + args );
    }
}