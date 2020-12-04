import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Abc{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();

        int i=0;
        List<Integer> list =new ArrayList<Integer>();
        while(i++<n){
            list.add(scanner.nextInt());
        }

        int x=scanner.nextInt();
        int count=0;
        for(int j=0;j<list.size();j++) {
            if(x==list.get(j)) {
                count++;
            }
        }
        System.out.println(count);
    }
}