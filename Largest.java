import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String fruits[] = new String[size];
        for(int i =0; i<size; i++){
            fruits[i]=sc.next();
        }
        String largest = fruits[0];
        for(int i =1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
