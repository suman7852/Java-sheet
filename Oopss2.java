import java.util.*;
public class Oopss2 {
    public static void main(String[] args) {
      BankAccount myAcc = new BankAccount();
      myAcc.username= "Suman Singh"; 
      myAcc.setPassword("abcdef"); 
      System.out.println(myAcc.username);
      System.out.println(myAcc.getPassword());
        
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
    password=pwd;
}
public String getPassword(){
    return password;
}
}
