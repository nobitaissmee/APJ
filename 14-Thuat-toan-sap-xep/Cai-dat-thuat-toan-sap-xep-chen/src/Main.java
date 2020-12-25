public class Main {
    public static void main(String[] args) {
        int []arr={1,21,2,6,3,61,3,6,723,23};

        for( int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key ){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

        for (int value:arr){
            System.out.print(value+",");
        }
    }
}
