import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Main {

    public static void main(String[] args) {
        String value = "Able was I ere I saw Elba";
        String value1="saaaaaabas";

        if (isPalindrome(value)) System.out.println("La chuoi Palindrome");
        else System.out.println("Ko la chuoi Palindrome");

        if (isPalindrome(value1)) System.out.println("La chuoi Palindrome");
        else System.out.println("Ko la chuoi Palindrome");
    }
    public static boolean isPalindrome(String value) {
        value=value.toUpperCase();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < value.length() / 2; i++) {
            stack.push(value.charAt(i));
        }
        for (int i = (value.length() % 2 ==0?value.length()/2:value.length()/2+1); i < value.length(); i++) {
            queue.offer(value.charAt(i));
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) return false;
        }
        return true;
    }
}

