import java.util.*;

public class QueueClf {
    public static void main(String[] args) {
    //  Queue<Integer> q = new LinkedList<>(); pointer takes more space and specific elements can be removed
     Queue<Integer> q = new ArrayDeque<>(); // prefered beacuse of less storage and fast 

        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.remove();

        System.out.println(q.peek());

    }

}
