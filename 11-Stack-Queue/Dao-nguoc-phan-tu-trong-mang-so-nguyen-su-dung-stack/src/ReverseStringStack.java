import java.util.Stack;

public class ReverseStringStack {

    public static void main(String[] args) {
        String first="Something is happy";

        Stack<Character> stack=new Stack<>();

        for (int i=0;i<first.length();i++){
            stack.push(first.charAt(i));
        }

        //StringBuider chuỗi có thể thay đổi
        StringBuilder last =new StringBuilder();

        //new StringBuider() tạo chuỗi vs độ dài là 16

        while (stack.size() > 0){
            last.append(stack.pop());
        }

        System.out.println(last.toString());
    }
}
