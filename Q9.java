import java.util.*;

public class Q9 {
    
    public static int fact(int n){
        int x=1;
        for(int i =1; i<=n; i++){
            x = x*i;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        double sum =0;
        double b;
        double c;
        double sum1;
        
       
        for(int i =0; i<=n; i++){
            
            int x=fact(2*i+1);
            if(i%2==0){
                sum+=(-1.0/x);
            }else{
                sum+=1.0/x;
            }
            System.out.println(sum);
          
        }
            // System.out.println(fact);
            System.out.println(sum);
        }
    
    
    }

