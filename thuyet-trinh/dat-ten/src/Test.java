import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(3);
//        list.add(1);
//        list.add(2);


        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list    .set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i)+ " ");
        }
    }
}
