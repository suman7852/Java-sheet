import java.util.*;
public class CalProd {
    public static int Product(int a, int b){
        int Product = a * b;
        return Product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Product = Product(a, b);
        System.out.println("Product of a and b is " + Product);
    }
}
