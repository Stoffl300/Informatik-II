/*package Test;*/

/**
 * Created by Markus on 19.04.2015.
 */
public class SayWhat {
    public static void main(String[] args) {
        if (0 < args.length) {
            int i;
            for (i = 0; i < args.length; i += 1) {
                System.out.println(args[i]);
            }
        } else {
            System.out.println("fehlende Argumente");
        }
    }
}

public class SayHello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}