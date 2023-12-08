import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int c;
        c = b;
        b = a;
        a = c;
        System.out.println("After Swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

}
