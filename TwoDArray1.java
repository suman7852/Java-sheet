import java.util.*;
public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] numbers = new int[rows][cols];
        System.out.println("Arays: ");
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                numbers[i][j]= sc.nextInt();
            }
        }
        System.out.println("x: ");
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                if(numbers[i][j]==x){
                    System.out.println("x is found at location: " + i+ " ," + j);
                }
            }
        }
    }
}
