public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = {4, 12, 7, 8, 1, 6, 9};

        System.out.println("The smallest element in the array is: " + minValue(arr));
    }

    static int minValue(int [] array){
        int min =array[0];

        for (int i=0;i<array.length;i++){
            if (min > array[i]){
                min=array[i];
            }
        }
        return min;
    }
}
