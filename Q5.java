import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swap");
        System.out.println("a " + a);
        System.out.println("b " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap");
        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}
