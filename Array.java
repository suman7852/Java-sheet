import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /* 
        // Declaration of array:
        int n=5;
        int [] arr= new int[n];

        System.out.println(arr.length); // size of the array
        arr[0]=4;
        arr[1]=20;

        System.out.println(arr[0]);

        for(int i=2; i<arr.length; i++){
            int x=sc.nextInt();
            arr[i]=x;
        }
        System.out.println("Printing the ele: ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        */

        // ArrayList
        ArrayList<Integer> res= new ArrayList<>();

        System.out.println(res.size());
        res.add(20);
        System.out.println(res.get(0));
        System.out.println(res);
        res.add(10);
        res.add(30);
        
        System.out.println(res);
        
        // for(int i=0; i<res.size(); i++){
            //     System.out.print(res.get(i)+" ");
            // }
            res.add(500);
            res.add(4,300);
            res.add(5,700);
            res.add(6,900);
            int size=res.size();  // size of arraylist
           
            System.out.println(res);
            System.out.println("Size: "+size);
        
    }
}
