import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float root1;
        float root2;
        float d = b*b -4 * a * c;
        if( a == 0 && b==0){
            System.out.println("No solution");
        }
        else if( a ==0){
            root1 = root2 =(float) -c/b;
            System.out.println("Roots are");
            System.out.println(root1);
            System.out.println(root2);
        }
        else if( d > 0){
            root1 = (-b+ (float) Math.pow(d,.5))/2 * a;
            root2 = (-b- (float) Math.pow(d,.5))/2 * a;
            System.out.println("Roots are");
            System.out.println(root1);
            System.out.println(root2);
        }
        else{
            System.out.println("No root");
        }
    }
}
