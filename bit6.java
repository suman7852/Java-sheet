import java.util.*;
public class bit6 {
    public static int updateIthBit(int n, int i, int newBit){
        int bitMask = ~(1<<i);
        int clearIthbit = n & bitMask;
         n = clearIthbit;
         bitMask = newBit<<i;
         return n | bitMask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int newBit = sc.nextInt();
        System.out.println(updateIthBit(n, i, newBit));
    }
}
