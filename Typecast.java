import java.util.*;
public class Typecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = a;
        System.out.println(a);
        System.out.println(b);
        double c = sc.nextDouble();
        int d = (int) c;
        System.out.println(c);
        System.out.println(d);
    }
    
}
