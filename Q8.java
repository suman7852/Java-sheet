import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum =0;
        double a;
        for (int i =1; i<=n; i++){
             a = 1.0/i;
             sum = sum + a;
             
        } 
        System.out.println("Sum is " + sum);
    }

}
