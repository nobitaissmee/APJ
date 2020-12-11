import java.util.Stack;

public class Main {
    private static final char LEFT_BRACKET= '(';
    private static final char RIGHT_BRACKET= ')';
    public static void main(String[] args) {
        String value="s * (s – a) * (s – b) * (s – c) ";
        if(check(value)) System.out.println("Well");
        else System.out.println("???");
        String value1="s * (s – a) * (s – b * (s – c)";
        if(check(value1)) System.out.println("Well");
        else System.out.println("???");
    }

    public static boolean check(String value){
        Stack<Character> stack=new Stack<>();

        for (int i=0;i<value.length();i++){
            switch (value.charAt(i)){
                case LEFT_BRACKET: stack.push(LEFT_BRACKET);
                break;
                case RIGHT_BRACKET:
                        if(stack.isEmpty()) return false;
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}