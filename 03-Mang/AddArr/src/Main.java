import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10,11,12};
        int[] result =new int[arr1.length+arr2.length];

        int index=0;
         for (int value:arr1){
             result[index++]=value;
         }
         for (int value:arr2){
             result[index++]=value;
         }

        System.out.println(Arrays.toString(result));
    }
}
