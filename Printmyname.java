import java.util.*;
public class Printmyname {
    public static void Func(String name) {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Func(name);
    }
    
}
