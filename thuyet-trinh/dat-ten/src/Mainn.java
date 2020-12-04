import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < n; i++){
            queue.add(sc.nextInt());
        }
        int k = sc.nextInt();
        while(k-- > 0){
            queue.add(queue.remove());
        }
        for(Integer i : queue){
            System.out.print(i + " ");
        }
    }
}