import java.util.*;

public class Colec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int min = list.get(0);
        int max = list.get(0);
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 1; i < n; i++) {
            if (list.get(i) < min){
                min = list.get(i);
                indexMin = i;
            }
            if (list.get(i) >= max){
                max = list.get(i);
                indexMax = i;
            }
        }

        Collections.swap(list, indexMin, indexMax);

        for (Integer integer: list) {
            System.out.print(integer + " ");
        }
    }

}