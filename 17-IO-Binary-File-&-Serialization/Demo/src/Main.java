import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();

        int [] a=new int [n];

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sc.nextLine();
        }

        sort(a);

        for (int value:a){
            System.out.print(value+" ");
        }
    }

        // Phương thức sắp xếp chèn
        static void sort(int arr[]) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
                // đến một vị trí trước vị trí hiện tại của chúng
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    }

