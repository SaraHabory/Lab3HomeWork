import java.util.Stack;

/**
 * Created by TGC on 19/03/2022.
 */
public class Lab3Q2 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<Integer>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println("Stack :"+stack);
        System.out.println("popped element:"+stack.pop());
        System.out.println("Stack after pop operation"+stack);
    }
}
