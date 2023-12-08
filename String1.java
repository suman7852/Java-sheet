import java.util.*;
public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        String fullname = name1 + " " + name2;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i=0; i<fullname.length();  i++){
            System.out.print(fullname.charAt(i));
        }
        System.out.println();
        if(name1.compareTo(name2)>1){
            System.out.println("name1 is greater than name2");
        }else if(name1.compareTo(name2)==0){
            System.out.println("name1 is equal to name2");
            
        }else{
            System.out.println("name1 is lesser than name2");

        }
        String name = fullname.substring(5,fullname.length());
        System.out.println(name);
    }
}
