import java.util.*;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String is ");
        String str = sc.nextLine();
        System.out.println("integer is ");
        int number = Integer.parseInt(str);
        System.out.println(number);
        int digit = sc.nextInt();
        String s = Integer.toString(digit);
        System.out.println(s);
        System.out.println(s.length());
    }
}
