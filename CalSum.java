import java.util.*;
public class CalSum {
    public static int CalculateSum(int a, int b){
        int sum = a+b;
        return sum;     //declare function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a , b);
        System.out.println(sum);
    }
}
