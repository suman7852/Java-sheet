import java.util.*;
public class LeararrList {
    public static void main(String[] args) {
        ArrayList<String> StudentName = new ArrayList<>();
        StudentName.add("Suman");
        System.out.println(StudentName);
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(1,50);
        list.set(2,1000);
        System.out.println(list);
        System.out.println(list.contains(50));
        for(int i=0; i<list.size(); i++){
            System.out.println("the element is" + list.get(i));

        }
        for(Integer element : list){
            System.out.println("for each elements is" + element);
        }
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.println("iterator" + it.next());
        }

        /* 
        List<Integer> newList = new ArrayList();
        newList.add(150);
        newList.add(200);
        list.addAll(newList);//This will add all the elements
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);//This will removethe element
        System.out.println(list);
        list.remove(Integer.valueOf(150));
        System.out.println(list);
        list.clear();// This will remove all the elements
        System.out.println(list);
        */
    }
}
