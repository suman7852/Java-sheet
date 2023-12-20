import java.util.*;
public class bit7 {
    public static int clearIbits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(clearIbits(n, i));
    }
}
