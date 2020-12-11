import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int value=10;

        Stack<Integer> stack=new Stack<>();

        while (value >0){
            stack.push(value%2);
            value=value/2;
        }

        for (int output:stack){
            System.out.print(output);
        }
    }
}
