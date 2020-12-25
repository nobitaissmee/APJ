import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        int size=-1;
        while (size<0 || size >30) {
            System.out.println("Enter size:");
            size=scanner.nextInt();
        }

        int [] arr=new int[size];
        int i=0;

        while(i<size){
            System.out.println("Element" +i +":");
            arr[i]=scanner.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if (arr[j] >= 5 && arr[j] <= 10)
                count++;
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
