import java.util.LinkedList;

/**
 * Created by gp2746me on 9/25/2018.
 */
public class CreateStack {
    public static void main(String[] args) {
        LinkedList stack = new LinkedList<>();
        stack.push("w.w.w.google.com");
        stack.push("w.w.w.minneapolis.edu");
        stack.push("w.w.w.youtube.com");
        System.out.println("top element =" + stack.peek());
        System.out.println(stack.pop());
        System.out.println("top element =" + stack.peek());

        }
}
