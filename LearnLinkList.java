import java.util.LinkedList;
import java.util.Queue;
public class LearnLinkList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); //add element
        queue.offer(24);
        queue.offer(36);
        queue.offer(48);
        System.out.println(queue);
        queue.poll(); //remove element
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek()); //next in line to come out
    }
}
