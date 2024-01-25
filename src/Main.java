import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args){
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        Integer el = stack.pop();
        System.out.println(el);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(3));
        System.out.println(stack.contains(0));
        System.out.println(stack.contains(2));

    }
}